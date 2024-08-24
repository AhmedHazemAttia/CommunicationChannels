package Channels;

public class SmsChannel implements CommunicationChannel {
    public void sendMessage(String message){
        System.out.println("Sending sms....." + message);
    }
}
