package in.ashokit.bean;

import org.springframework.stereotype.Component;

@Component
public class AmazonOrderService implements  InterfaceDemo{
    @Override
    public void placeOrder() {
        System.out.println("Order Placed on Amazon.");
    }
}
