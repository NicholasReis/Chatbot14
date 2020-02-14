import java.util.Scanner;
class ChatBot{
    public static void main(String[] args){
        //Initializes scanner
        Scanner scan = new Scanner(System.in);
        //Initializes the bot
        Bot ai = new Bot();
        System.out.println("Enter an empty response to exit");
        String text = ""; //Declared here so it's stored at the same address instead of a new one
        String response = ""; //Same reason for it being declared here
        do{
            System.out.print("User: "); //Shows in console the user said it
            text = scan.nextLine(); //Reads in a sentence from user
            System.out.println("Bot: " + ai.process(text)); //Shows in console the ai said it
        }while(!text.toLowerCase().equals("")); //While the user isn't just pressing enter
        System.out.println("Goodbye."); //Program ends
    }
}
