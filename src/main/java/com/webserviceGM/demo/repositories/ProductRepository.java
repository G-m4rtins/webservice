package com.webserviceGM.demo.repositories;

import com.webserviceGM.demo.entities.Category;
import com.webserviceGM.demo.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {

}
