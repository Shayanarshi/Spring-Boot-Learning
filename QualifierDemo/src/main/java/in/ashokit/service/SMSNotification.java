package in.ashokit.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class SMSNotification implements  NotificationService{
    @Override
    public void send(String s) {
        System.out.println("SMS Notification Sent to "+s);
    }
}
