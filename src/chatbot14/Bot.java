package chatbot14;

public class Bot{
    public String process(String sentence){
    	
    	
    	String response = "";
    	//Reads in all the sentence as individual words
        String[] words = sentence.split(" ");
        //If they responded
        if(!words[0].equals("")){
          //Initializes the string to concatenate
            response = "";
            //Number of words in sentence
            int index = 0;
            //Analyzes words
            GenerateResponse.generateResponse(words);
            while(index < words.length){
                //Temporary response for test before we work on analyzing
                response += words[index] + " ";
                
                //Increments word
                index++;
            }
            //Adds question mark to make what you said a question
            response += "?";
        }
        //Needs to cut off last space
        return response;
    }
}
