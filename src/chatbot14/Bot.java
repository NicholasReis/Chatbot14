package chatbot14;

public class Bot{
    ResponseGenerator rG;
    String scriptPath = "";
    public Bot(){
        scriptPath = "script.txt";
        rG = new ResponseGenerator(scriptPath);
    }
    //Overloaded so we can manually set the filepath
    public Bot(String path){
        scriptPath = path;
        rG = new ResponseGenerator(scriptPath);
    }
    
    
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
            response = rG.generateResponse(words);
        }
        //Needs to cut off last space
        return response;
    }
    
    public String getScriptPath(){
        return scriptPath;
    }
}
