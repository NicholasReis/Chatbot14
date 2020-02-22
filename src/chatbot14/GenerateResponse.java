package chatbot14;

import java.util.ArrayList;
import java.util.List;

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
	
	private static String[] transformKeywords(String[] words) {
		//transform keywords change to the actual string in second arraylist
		for(int i = 0; i<words.length; i++) {
			for(int j = 0; j<transform.length;j++) {
				if (words[i].equals(transform[0][j]))
					words[i].equals(transform[1][j]);
			}
			}
		return words;
	}
	
	private static List<Integer> searchKeywords(String[] words1) {
		//search if the keywords match the keywords list, return the index of the keywords match which in the list
		List<Integer> myList = new ArrayList<Integer>();
		for(int i = 0; i<words1.length;i++) {
			for(int j = 0;j<keywords.length;j++) {
				if(words1[i].equals(keywords[j]))
					myList.add(j);
			}
		}
		return myList;
	}
	
	private static String combineSentence(String[] words2, List<Integer> index) {
		//  iterate through words 2 and combine them into one String
		String s = "";
		for(int i = 0;i<index.toArray().length;i++) {
			s += keywords[index.indexOf(i)];
		}
		return s;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
