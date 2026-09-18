package in.ashokit.repository;

import in.ashokit.model.Order;
import in.ashokit.model.OrderStatus;
import org.aspectj.weaver.ast.Or;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order,Long> {

    // find order by status
    List<Order> findByStatus(OrderStatus status);

    // find the orders by amount greater than
    List<Order> findByAmountGreaterThan(Double amount);


}
