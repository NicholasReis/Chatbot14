package chatbot14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class GenerateResponse {
	
	// The first row of the transform array is the words we want to change, the second row are the words we want to change them into
	static String[][] transform = {{"how","when","am","your","were","me","you're","i'm","myself","yourself","you","i","everybody","nobody","noone"},
			{"what","what","are","my","was","you","i'm","you're","yourself","myself","i","you","everyone","everyone","everyone"}};
	
	// These are the keywords we are searching for to generate a response
	static String[] keywords = {"are","what","because","always","everyone","was","if","remember"};
	
	//these are the patterns for each of the keywords
	static ArrayList<ArrayList<String>> keywordPatterns = new ArrayList(Arrays.asList(
			new ArrayList(Arrays.asList("(0 are you 0)")), //are
			new ArrayList(Arrays.asList("(0)")), //what
			new ArrayList(Arrays.asList("(0)")), //because
			new ArrayList(Arrays.asList("(0)")), //always
			new ArrayList(Arrays.asList("(0)")), // everyone
			new ArrayList(Arrays.asList("(0 was you 0)","(0 you was 0)","(0 was i 0)")), // was  
			new ArrayList(Arrays.asList("(0 if 0)")), // if
			new ArrayList(Arrays.asList("(0 i remember 0)","(0 do you remember 0)")))); //remember
	
	// these are responses. It's a triple nested arraylist because if there are multiple patterns per keyword, then you have multiple responses
	static ArrayList<ArrayList<ArrayList<String>>> keywordResponses = new ArrayList(Arrays.asList(
			new ArrayList(new ArrayList(Arrays.asList(
					new ArrayList(Arrays.asList("(do you believe you are 4)","(would you want to be 4)","(you wish i would tell you you are 4)","(what would it mean if you were 4)"))))
					), //are
			new ArrayList(new ArrayList(Arrays.asList(
					new ArrayList(Arrays.asList("(why do you ask)","(does that question interest you)","(what is it you really want to know)","(are such questions much on your mind)","(what answer would please you most)","(what do you think)","(what comes to your mind when you ask that)","(have you asked such question before)","(have you asked anyone else)"))))
					), //what
			new ArrayList(new ArrayList(Arrays.asList(
					new ArrayList(Arrays.asList("(is that the real reason)","(don't any other reasons come to mind)","(does that reason seem to explain anything else)","(what other reasons might there be)"))))
					), //because
			new ArrayList(new ArrayList(Arrays.asList(
					new ArrayList(Arrays.asList("(can you think of a specific example)","(when)","(what incident are you thinking of)","(really, always)"))))
					), //always
			new ArrayList(new ArrayList(Arrays.asList(
					new ArrayList(Arrays.asList("(can you think of anyone in particular)","(who, for example)","(you are thinking of a very special person)","(who, may I ask)","(someone special perhaps)","(you have a particular person in mind, don't you)","(who do you think you're talking about)"))))
					), //everyone
			new ArrayList(new ArrayList(Arrays.asList(
					new ArrayList(Arrays.asList("(what if you were 4)","(do you think you were 4)","(were you 4)","(what would it mean if you were 4)","(what does ' 4 ' suggest to you))")), 
					new ArrayList(Arrays.asList("(were you really)","(why do you tell me you were 4 now)","(perhaps i already knew you were 4) )")), 
					new ArrayList(Arrays.asList("(would you like to believe i was 4)","(what suggests that i was 4)","(what do you think)","(perhaps i was 4)","(what if i had been 4)"))))
					), // was
			new ArrayList(new ArrayList(Arrays.asList(
					new ArrayList(Arrays.asList("(do you think its likely that 3)","(do you wish that 3)","(what do you think about 3)","(really, 2 3)"))))
					), //if
			new ArrayList(new ArrayList(Arrays.asList(
					new ArrayList(Arrays.asList("Do you often think of 0?","Does thinking of 0 bring anything else to mind?","What else do you remember?","Why did you remember 0 just now?","What in the present situation reminds you of 0?","What is the connection between me and 0?")), 
					new ArrayList(Arrays.asList("Did you think I would forget 0?","Why do you think I should recall 0 now?","What about 0?","You mentioned 0."))))
					))); //remember

	public static String generateResponse(String[] words) {
		// transform the necessary words, plus generate a stack of the indices of keywords in the String array words
		words = transformKeywords(words);
		Stack<Integer> index = searchKeywords(words);
		String wholeSentence = combineSentence(words);
		
		
		String response="";
		
		return response;
	}
	/*
	Loop through every word in the String array words and check if it matches any of the words in the first row of the 2-D string 
	array transform (how, when, am, your). If there is a match convert them to their appropriate transformation in the second row 
	of the 2-D string array transform (what, what, are, my). For example, how->what, when -> what, am -> are.
	*/
	static String[] transformKeywords(String[] words) {
		//transform keywords change to the actual string in second arraylist
		for(int i = 0; i<words.length; i++) {
			for(int j = 0; j<transform[0].length;j++) {
				if (words[i].equals(transform[0][j])) {
					words[i] = transform[1][j];
					break; //can only transform a word once
				} 
			}
		}
		return words;
	}
	/*
	Loop through every word in the String array words and check for the keywords (are, can, what). 
	If you find a keyword, then return the index that the keyword is found. 
	ie. if you find the keyword "are", then return index 0.
	*/
	static Stack<Integer> searchKeywords(String[] words1) {
		//search if the keywords match the keywords list, return the index of the keywords match which in the list
		Stack<Integer> stack = new Stack<Integer>();
		for(int i = 0; i<keywords.length;i++) {
			for(int j = 0;j<words1.length;j++) {
				if(words1[j].equals(keywords[i]))
					stack.push(i);
			}
		}
		return stack;
	}
	/*
	Combine the words in the String array into one word, in order to get ready to apply the regex expression.
	*/
	static String combineSentence(String[] words2) {
		//  iterate through words2 and combine them into one String
		String s = "";
		s = s.concat(words2[0]);
		for(int i = 1;i<words2.length;i++) {
			s = s.concat(" " + words2[i]);
		}
		return s;
	}
	/*
	Extract the relevant input from the user input and transform it according to an appropriate rule related to the keyword
	First step for this is to try one keyword and apply an appropriate response.
	*/
	static String applyPatternAndGetResponse(String wholeSentence, Stack<Integer> index) {
		// if stack is empty, return null
		
		// for the first keyword that matches, find if the pattern matches.
		
		// if the pattern matches apply the rule
		
		// else return null
		
		if(index.isEmpty()==true)
			return null;
		//if(wholeSentence.matches(keywords[index.firstElement()])==true){
		else if(wholeSentence.matches(keywordPatterns.get(index.firstElement()).toString())) {
				return keywordResponses.get(index.firstElement()).toString();
			}
			else
				return null;
		//}
		
		//return "";
	}
	
	public static void main(String[] args) {

		
		
	}

}
