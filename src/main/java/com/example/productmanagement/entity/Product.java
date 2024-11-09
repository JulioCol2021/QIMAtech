
package com.example.productmanagement.entity;

import javax.persistence.*;

/**
 * Entity representing a Product in the system.
 * This class uses JPA annotations to map the Product to the database.
 * It follows best practices for entity design, adhering to SOLID principles.
 */
@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(length = 1024)
    private String description;

    @Column(nullable = false)
    private Double price;

    private String categoryPath;

    private Boolean available;

    /**
     * Gets the ID of the product.
     * 
     * @return the product ID
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the ID of the product.
     * 
     * @param id the product ID to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Gets the name of the product.
     * 
     * @return the product name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the product.
     * 
     * @param name the product name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the description of the product.
     * 
     * @return the product description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the description of the product.
     * 
     * @param description the product description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Gets the price of the product.
     * 
     * @return the product price
     */
    public Double getPrice() {
        return price;
    }

    /**
     * Sets the price of the product.
     * 
     * @param price the product price to set
     */
    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * Gets the category path of the product.
     * 
     * @return the product category path
     */
    public String getCategoryPath() {
        return categoryPath;
    }

    /**
     * Sets the category path of the product.
     * 
     * @param categoryPath the product category path to set
     */
    public void setCategoryPath(String categoryPath) {
        this.categoryPath = categoryPath;
    }

    /**
     * Gets the availability status of the product.
     * 
     * @return true if the product is available, false otherwise
     */
    public Boolean getAvailable() {
        return available;
    }

    /**
     * Sets the availability status of the product.
     * 
     * @param available the availability status to set
     */
    public void setAvailable(Boolean available) {
        this.available = available;
    }
}
