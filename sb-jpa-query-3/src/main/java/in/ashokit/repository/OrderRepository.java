package in.ashokit.repository;

import in.ashokit.model.Order;
import in.ashokit.model.OrderStatus;
import org.aspectj.weaver.ast.Or;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order,Long> {


    //select the orders between two dates

    @Query(value = "SELECT o FROM Order o WHERE o.orderDate BETWEEN ?1 AND ?2",nativeQuery = false)
    List<Order> fetchOrdersBetweenDates(LocalDate startDate,LocalDate endDate);


    // select the orders with status1 or status2 delivered or cancelled


  /*@Query(value = "SELECT * FROM ORDERS WHERE STATUS = ? OR STATUS=? ",nativeQuery = true)
    List<Order> getOrdersWithStatus(OrderStatus status1,OrderStatus status2);*/

    @Query(value = "SELECT * FROM ORDERS WHERE STATUS = ? OR STATUS=? ",nativeQuery = true)
    List<Order> getOrdersWithStatus(String status1,String status2);

    @Query(value = "SELECT * FROM ORDERS WHERE Amount = (SELECT MAX(AMOUNT) FROM ORDERS)" ,nativeQuery = true)
    List<Order> fetchHighestAmountOrder();

    @Query(value="select o from Order o where o.amount > :amount and o.status = :sts")
    List<Order>  fetchOrdersByStatus(@Param("amount")Double amount,
                                                @Param("sts") OrderStatus status);





}
