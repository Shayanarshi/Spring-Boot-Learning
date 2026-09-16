package in.ashokit.bean;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service("nService")
@Scope("singleton")
@Lazy
public class NotificationService {
    public  NotificationService(){
        System.out.println("Notification :: Constructor ");

    }

}
