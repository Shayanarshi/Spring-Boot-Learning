package in.ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    @Value("alexa@gmail.com")
    private String email;
    @Value("9876543210")
    private String mobile;


    @Autowired
    @Qualifier(value = "emailNotification")
    NotificationService eservice;


    @Autowired
    NotificationService sservice;
    public  void  createCustomer(){
        System.out.println("Customer is Created");
        eservice.send(email);
        sservice.send(mobile);
    }
}
