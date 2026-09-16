package in.ashokit.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Order {
    InterfaceDemo interfaceDemo;

    @Autowired
    public void setInterfaceDemo(InterfaceDemo interfaceDemo) {
        this.interfaceDemo = interfaceDemo;
    }
    public  void processOrder(){
        interfaceDemo.placeOrder();
    }

}
