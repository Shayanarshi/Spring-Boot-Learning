package in.ashokit.main;

import in.ashokit.config.AppConfig;
import in.ashokit.service.CustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Object ob = context.getBean("customerService");
        CustomerService cs = (CustomerService) ob;
        cs.createCustomer();
    }
}
