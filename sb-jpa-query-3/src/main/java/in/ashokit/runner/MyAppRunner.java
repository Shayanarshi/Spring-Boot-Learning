package in.ashokit.runner;

import in.ashokit.model.Order;
import in.ashokit.model.OrderStatus;
import in.ashokit.repository.OrderRepository;
import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MyAppRunner implements ApplicationRunner {

    @Autowired
    OrderRepository repository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
     /*   List<Order> orderList =repository.fetchByAmountAndStatus(OrderStatus.DELIVERED,4000.0);
        orderList.forEach(System.out::println);*/


        List<Order> orderList = repository.fetchAllOrders();
        orderList.forEach(System.out::println);
    }

}
