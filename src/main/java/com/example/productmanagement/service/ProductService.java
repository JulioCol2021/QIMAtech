
package com.example.productmanagement.service;

import com.example.productmanagement.entity.Product;
import com.example.productmanagement.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Service class for managing products.
 * This class follows the SOLID principles to provide a clean separation of concerns.
 */
@Service
public class ProductService {

    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    /**
     * Retrieves all products from the database.
     * 
     * @return a list of all products
     */
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    /**
     * Retrieves a product by its ID.
     * 
     * @param id the ID of the product
     * @return an Optional containing the product if found, or empty otherwise
     */
    public Optional<Product> getProductById(Long id) {
        return productRepository.findById(id);
    }

    /**
     * Saves a new product or updates an existing one.
     * 
     * @param product the product to save
     * @return the saved product
     */
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    /**
     * Deletes a product by its ID.
     * 
     * @param id the ID of the product to delete
     */
    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }
}
