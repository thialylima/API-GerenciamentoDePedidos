package com.thialy.desafio_api.model.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.thialy.desafio_api.model.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

    // contar os orders para não passar de 10
    @Query("SELECT COUNT(o) FROM Order o")
    long countOrders();
}
