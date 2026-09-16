package in.ashokit.bean;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Primary
@Component
public class BigbasketOrderService implements  InterfaceDemo{
    @Override
    public void placeOrder() {
        System.out.println("Order Placed on Bigbasket");
    }
}
