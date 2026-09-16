package in.ashokit.bean;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component
public class FlipkartOrderService implements InterfaceDemo {
    @Override
    public void placeOrder() {
        System.out.println("Order Placed on Flipkart.");
    }
}
