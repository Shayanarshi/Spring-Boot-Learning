package in.ashokit.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
public class EmailNotification implements  NotificationService{
    @Override
    public void send(String s) {
        System.out.println("Email Notification sent to "+s);
    }
}
