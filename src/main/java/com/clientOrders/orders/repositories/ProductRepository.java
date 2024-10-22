package com.clientOrders.orders.repositories;

 import com.clientOrders.orders.entities.Product;
 import org.springframework.data.jpa.repository.JpaRepository;
 import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
