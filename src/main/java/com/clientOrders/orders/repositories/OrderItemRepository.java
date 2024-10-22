package com.clientOrders.orders.repositories;

 import com.clientOrders.orders.entities.OrderItem;
 import org.springframework.data.jpa.repository.JpaRepository;
 import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
