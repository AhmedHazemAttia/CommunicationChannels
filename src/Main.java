import Application.CommunicationHandler;

public class Main {
    public static void main(String [] args){
        CommunicationHandler user = new CommunicationHandler();

        user.sendMessage("Hello Ahmed", "sms");
        user.sendMessage("Hello AbdelQader", "email");
        user.sendMessage("Hello Ahmed & abdelqader", "push");
//        user.sendMessage("Hello Ahmed & abdelqader in wrong type", "smss");


    }
}