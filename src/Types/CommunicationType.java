package Types;

import Channels.CommunicationChannel;

public interface CommunicationType {
    CommunicationChannel createChannel(String type);
}
