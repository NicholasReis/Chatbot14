package chatbot14;

public class GenerateResponse {
	
	// The first row of the transform array is the words we want to change, the second row are the words we want to change them into
	static String[][] transform = {{"how","when","am","your","were","me","you're","i'm","myself","yourself","you","i","everybody","nobody","noone"},
			{"what","what","are","my","was","you","i'm","you're","yourself","myself","i","you","everyone","everyone","everyone"}};
	
	// These are the keywords we are searching for to generate a response
	static String[] keywords = {"are","can","what","because","always","everyone","was","if","remember"};
	
	public static String generateResponse(String[] words) {
		// transform the necessary words, plus generate a stack of the indices of keywords in the String array words
		words = transformKeywords(words);
		int index = searchKeywords(words);
		String wholeSentence = combineSentence(words);
		
		
		String response="";
		
		return response;
	}
	
	private static String[] transformKeywords(String[] words) {
		//transform keywords change to the actual string in second arraylist
		for (i=0;i<length())
		return words;
	}
	
	private static int searchKeywords(String[] words1) {
		//search if the keywords match the keywords list, return the index of the keywords match which in the list
		return 0;
	}
	
	private static String combineSentence(String[] words2) {
		//  iterate through words 2 and combine them into one String
		
		return "";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
