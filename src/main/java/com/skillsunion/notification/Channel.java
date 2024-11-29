/*
    TODO:
    The channel of notification can be SMS or Email. 
    Set this class up as a @Bean by creating a configuration class with @Configuration annotation. Set the type to "SMS".
*/
package com.skillsunion.notification;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

public class Channel {
    String type;

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

}

@Configuration
class channelConfig {

    @Bean
    public Channel channel() {
        // create a new instance of channel
        Channel channel = new Channel();
        // set channel type to "sms"
        channel.setType("SMS");
        // return channel as a spring managed bean
        return channel;
    }
}