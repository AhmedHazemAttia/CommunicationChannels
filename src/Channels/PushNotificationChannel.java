package Channels;

public class PushNotificationChannel implements CommunicationChannel {
    public void sendMessage(String message){
        System.out.println("Notification Sent " +message);
    }
}
