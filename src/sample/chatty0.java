package sample;

/* Simple example of how to use regex expressions 
 * First iteration of chatty series
 * Mostly used for teaching
 * only one iteration
 */

public class chatty0 {

	public static void main(String[] args) {
		System.out.print("Bot: ");
		print("What do you remember?");
		// In the regex pattern below, parenthesis form sections.
		// There are three sections in the pattern below, each referred to as $1, $2, $3
		// .* means any number of characters, so the regex pattern below is checking if the phrase compared to it contain "i remember "
		String rememberPattern = "(.*)(i remember )(.*)";
		// instead of actually getting the userInput from the user, we hardcode it here
		String userInput = "i remember picking flowers";
		print("User: " + userInput);
		// we extract the "picking flowers" from the userInput
		userInput = userInput.replaceFirst(rememberPattern, "$3");
		System.out.print("Bot: ");
		String rememberResponse = "Do you often think of 0?";
		// We are replacing the 0 in the rememberResponse with the input we extracted above
		print(rememberResponse.replaceAll("(.*)(0)","$1" + userInput)); 
	}
	
	public static void print(String s) {
		System.out.println(s);
	}
	public static void print(int i) {
		System.out.println(i);
	}
}
