package in.ashokit.main;

import in.ashokit.bean.OrderService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.naming.Context;

public class Main {
    public static void main(String[] args) {
        //starts the spring Container
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");

        // get the OrderService bean
        Object ob = ctx.getBean("orderService");
        OrderService orderService = (OrderService) ob;
        // calling the method
        orderService.placeOrder("iphone17",5);

    }
}
