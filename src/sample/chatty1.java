package sample;

import java.util.Scanner;
import java.util.regex.*;

/* Limitations: 
 * 1. can only write in lowercase - it doesn't parse uppercase yet.
 * 2. Need to use keyword "i remember" or "do you remember" in user input
 * Sample output: (alternating computer and me)
  	What do you remember?
	i remember going for a walk
	Do you often think of going for a walk?
	do you remember walking with me
	You mentioned walking with me.
	i remember walking with you
	Do you often think of walking with you?
 */
	// next step is replace i and me with you and vice versa

public class chatty1 {

	static String[] rememberPattern = {"(.*)(i remember )(.*)",
	"(.*)(do you remember )(.*)"};
	
	static String[][] rememberResponse = {{"Do you often think of 0?",
		"Does thinking of 0 bring anything else to mind?",
		"What else do you remember?",
		"Why did you remember 0 just now?",
		"What in the present situation reminds you of 0?",
		"What is the connection between me and 0?"},
		{"Did you think I would forget 0?",
		"Why do you think I should recall 0 now?",
		"What about 0?",
		"You mentioned 0."}};
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// Initial greeting
		print("What do you remember?");
		int numIter = 0;
		int n = 3;
		while (numIter < n) {
			//userInput = "i remember picking flowers";
			System.out.print("User: ");
			String userInput = in.nextLine();
			for (int i = 0; i < rememberPattern.length; i++) { 
				// check if input matches either pattern in rememberPattern
				if (userInput.matches(rememberPattern[i])) { 
					// extract the part of the input we need
					userInput = userInput.replaceFirst(rememberPattern[i], "$3"); 
					// the random number will choose a random response from the list
					int r = (int)(Math.random()*rememberResponse[i].length); 
					System.out.print("Bot: ");
					// We are replacing the 0 in the rememberResponse with the input we extracted above
					print(rememberResponse[i][r].replaceAll("(.*)(0)","$1" + userInput)); 					
				}
			}
			numIter++;
		}
		in.close();
	}
	
	public static void print(String s) {
		System.out.println(s);
	}
	public static void print(int i) {
		System.out.println(i);
	}

}
