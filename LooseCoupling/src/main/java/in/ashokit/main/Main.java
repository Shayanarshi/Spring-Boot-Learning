package in.ashokit.main;

import in.ashokit.bean.Order;
import in.ashokit.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        Order order = ctx.getBean(Order.class);
        order.processOrder();

    }
}

