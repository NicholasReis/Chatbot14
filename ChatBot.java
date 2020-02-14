import java.util.Scanner;
class ChatBot{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Bot ai = new Bot();
        System.out.println("Enter an empty response to exit");
        String text = ""; //Declared here so it's stored at the same address instead of a new one
        String response = "";
        do{
            System.out.print("User: ");
            text = scan.nextLine();
            System.out.println("Bot: " + ai.process(text));
        }while(!text.toLowerCase().equals(""));
        System.out.println("Goodbye.");
    }

}
