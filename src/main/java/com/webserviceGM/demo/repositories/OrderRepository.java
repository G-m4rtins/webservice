package com.webserviceGM.demo.repositories;

import com.webserviceGM.demo.entities.Order;
import com.webserviceGM.demo.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {

}
