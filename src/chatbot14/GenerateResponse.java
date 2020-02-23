package chatbot14;

import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
public class ResponseGenerator{
    /*
     * It felt weird to leave the query transformer in the bot class since
     * we would be passing the query to the transformer, getting it back and
     * then passing the transformed query to this method. I think it makes more
     * sense in here personally.
    */
    QueryTransformer qT = new QueryTransformer();
    //Initializes the variables we need and makes them global
    File script;
    HashMap responses = new HashMap();
    
    public ResponseGenerator(String scriptPath)
    {
        //The script has a default that will be sent, or can be user specified
        //It will always be sent. We could check if it exists here.
        script = new File(scriptPath);
        
        //This will call the method below so we only have to populate once
        //Then we can pull from it instead of remaking it every time we want
        //a new response
        populateMaps(script);
    }

    public void populateMaps(File script){
        try{
            Scanner scriptInput = new Scanner(script);
            while(scriptInput.hasNextLine()){
                //We will need to figure out a good way to pull the data
                //From the file
                scriptInput.nextLine();
            }
        }catch(Exception e){
            //Left as a catchall for various problems, but the biggest
            //will be having the wrong filepath
            e.printStackTrace();
        }
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String generateResponse(String[] words)
    {
        //this method should return the tranformed query to give to Heather
        qT.transform(words);
        
        //This is where most of Heather's code will go.
        
        
        //Once we populate the hashmaps we can sort through responses very fast
        //Then it will be manipulated and sent back to the bot
        return "";
    }
}
