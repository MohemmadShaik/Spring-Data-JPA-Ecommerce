package com.example.SBW_Ecom.repository;

import com.example.SBW_Ecom.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

    List<Product> findByCategory(String category);


    /*  Spring Data JPA
            ↓
       JPA Specification
            ↓
       Hibernate (ORM)
            ↓
          JDBC
            ↓
        Database

    */

}
