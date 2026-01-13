package com.example.SBW_Ecom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SbwEcomApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbwEcomApplication.class, args);

        /* System.out.println(Entity.class.isInterface());  // true
        System.out.println(Entity.class.isAnnotation());    // true

        System.out.println(Product.class.isInterface());    // false
        System.out.println(Product.class.isAnnotation());   // false */
	}

}
