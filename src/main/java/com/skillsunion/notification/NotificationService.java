
/*
    TODO:
    - Annotate this class with @Component
    - Inject the Channel and Message instance using @Autowired
*/

package com.skillsunion.notification;

import org.springframework.stereotype.Component;

@Component
public class NotificationService {
    // instance fields
    Channel channel;
    Message message;

    // constructor injection
    public NotificationService(Channel channel, Message message) {
        this.channel = channel;
        this.message = message;
    }

    public void setup(String to, String messagecontent) {
        message.setTo(to);
        message.setMessage(messagecontent);
    }

    public void send() {
        StringBuilder messageBuilder = new StringBuilder();
        messageBuilder.append("To:");
        messageBuilder.append(this.message.getTo());
        messageBuilder.append("\nMessage:");
        messageBuilder.append(this.message.getMessage());
        messageBuilder.append("\nChannel:");
        messageBuilder.append(this.channel.getType());

        System.out.println(messageBuilder.toString());
    }
}
