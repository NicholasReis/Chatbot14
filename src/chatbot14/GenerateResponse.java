package chatbot14;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GenerateResponse {
	
	// The first row of the transform array is the words we want to change, the second row are the words we want to change them into
	static String[][] transform = {{"how","when","am","your","were","me","you're","i'm","myself","yourself","you","i","everybody","nobody","noone"},
			{"what","what","are","my","was","you","i'm","you're","yourself","myself","i","you","everyone","everyone","everyone"}};
	
	// These are the keywords we are searching for to generate a response
	static String[] keywords = {"are","can","what","because","always","everyone","was","if","remember"};
	
	public static String generateResponse(String[] words) {
		// transform the necessary words, plus generate a stack of the indices of keywords in the String array words
		words = transformKeywords(words);
		List<Integer> index = searchKeywords(words);
		String wholeSentence = combineSentence(words,index);
		
		
		String response="";
		
		return response;
	}
	
	static String[] transformKeywords(String[] words) {
		//transform keywords change to the actual string in second arraylist
		for(int i = 0; i<words.length; i++) {
			for(int j = 0; j<transform[0].length;j++) {
				if (words[i].equals(transform[0][j]))
					words[i] = transform[1][j];
				}
			}
		return words;
	}
	
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
	
	private static String combineSentence(String[] words2, List<Integer> index) {
		//  iterate through words2 and combine them into one String
		String s = "";
		for(int i = 0;i<index.toArray().length;i++) {
			s += keywords[index.indexOf(i)];
		}
		return s;
	}
	
	public static void main(String[] args) {
		String[] words1 = "you are funny because everyone says you are".split(" ");
		Stack<Integer> stack = searchKeywords(words1);
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}

}
