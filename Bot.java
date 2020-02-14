public class Bot
{
    //ArrayList<String> words = new ArrayList<String>();
    String[] words = {};
    public String process(String sentence){
        words = sentence.split(" ");
        String response = "";
        if(!words[0].equals("")){

            int index = 0;
            while(index < words.length){
                response += words[index] + " ";
                index++;
            }
            response += "?";
        }
        //Could cut off the last space if we wanted
        return response;
    }
}
