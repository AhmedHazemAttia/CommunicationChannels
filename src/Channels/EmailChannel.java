package Channels;

public class EmailChannel implements CommunicationChannel {
    public void sendMessage(String message) {
        System.out.println("Sending Email..." + message);
    }
}
