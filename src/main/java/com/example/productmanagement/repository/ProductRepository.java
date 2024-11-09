
package com.example.productmanagement.repository;

import com.example.productmanagement.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository interface for Product entities.
 * This interface extends JpaRepository to provide CRUD operations.
 */
@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
