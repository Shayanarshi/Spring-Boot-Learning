package in.ashokit.main;

import in.ashokit.bean.OrderStatus;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
        Object ob = ctx.getBean("orderStatus");
        OrderStatus orderStatus = (OrderStatus) ob;
        orderStatus.findOrderStatus("123-456");
    }
}
