package in.ashokit.main;

import in.ashokit.bean.NotificationService;
import in.ashokit.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

       NotificationService ns = (NotificationService)context.getBean("nService");


    }
}
