package Application;

import Channels.*;
import Types.*;
public class CommunicationHandler {
    public CommunicationType type;

    public CommunicationHandler(){
        this.type = new CommunicationCreator();
    }

    public void sendMessage(String message, String type){
        CommunicationChannel channel = this.type.createChannel(type);
        channel.sendMessage(message);
    }
}
