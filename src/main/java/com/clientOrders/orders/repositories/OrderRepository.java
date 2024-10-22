package com.clientOrders.orders.repositories;

 import com.clientOrders.orders.entities.Order;
 import org.springframework.data.jpa.repository.JpaRepository;
 import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}
