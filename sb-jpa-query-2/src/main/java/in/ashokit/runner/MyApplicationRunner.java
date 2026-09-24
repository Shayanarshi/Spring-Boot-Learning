package in.ashokit.runner;

import in.ashokit.model.Order;
import in.ashokit.model.OrderStatus;
import in.ashokit.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

@Component
public class MyApplicationRunner implements ApplicationRunner {

    @Autowired
    OrderRepository repo;

    @Override
    public void run(ApplicationArguments args) throws Exception {

//        getOrdersBetweenDates();
//        readTheOrderWithStatus();
//        fetchTheHighestOrder();
        fetchOrdersByStatus();
    }

    private void  fetchOrdersByStatus(){
        List<Order> orderDetails = repo.fetchOrdersByStatus(1000.0,OrderStatus.DELIVERED);
        orderDetails.forEach(System.out::println);

    }
    private void fetchTheHighestOrder(){
        List<Order> orderList=repo.fetchHighestAmountOrder();
        orderList.forEach(System.out::println);
    }


    private  void  readTheOrderWithStatus(){
        List<Order> ordersWithStatus=repo.getOrdersWithStatus(OrderStatus.PLACED.name(),OrderStatus.CANCELLED.name());
        ordersWithStatus.forEach(System.out::println);
    }


    private void getOrdersBetweenDates(){
        LocalDate startDate = LocalDate.of(2026,9,13);
        LocalDate endDate = LocalDate.of(2026,9,15);
        List<Order> orderList =repo.fetchOrdersBetweenDates(startDate,endDate);

        orderList.forEach(System.out::println);
    }
}
