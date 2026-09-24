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

List<Order> fetchByAmountAndStatus(@Param("status") OrderStatus stat,
                                   @Param("amount") Double amount);

List<Order> fetchAllOrders();




}
