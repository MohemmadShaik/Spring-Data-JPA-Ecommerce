package com.example.SBW_Ecom.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table (name = "ecom_products")
public class Product { // table name

    // ORM - Object Relational Mapping
    // Entity and ORM
    //JPA

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id; //column name

    @Column(name = "product_name", length = 100)
    String name;

    @Column(nullable = false)
    float price;

    String category;


}
