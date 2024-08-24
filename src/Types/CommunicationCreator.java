package Types;
import Channels.*;

public class CommunicationCreator implements CommunicationType {

    public CommunicationChannel createChannel(String type) {
        return switch (type) {
            case "sms" -> new SmsChannel();
            case "email" -> new EmailChannel();
            case "push" -> new PushNotificationChannel();
            default -> null;
        };
    }
}
