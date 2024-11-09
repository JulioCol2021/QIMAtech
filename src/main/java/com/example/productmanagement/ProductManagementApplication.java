
package com.example.productmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Main class to start the Spring Boot application.
 * This class follows the SOLID principles to provide a clean architecture and includes error handling for startup failures.
 */
@SpringBootApplication
public class ProductManagementApplication {

    public static void main(String[] args) {
        try {
            ConfigurableApplicationContext context = SpringApplication.run(ProductManagementApplication.class, args);
        } catch (Exception e) {
            System.err.println("Application failed to start due to an error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
