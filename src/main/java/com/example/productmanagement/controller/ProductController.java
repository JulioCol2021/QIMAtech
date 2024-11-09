
package com.example.productmanagement.controller;

import com.example.productmanagement.entity.Product;
import com.example.productmanagement.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Controller class for managing product-related HTTP requests.
 * This class follows the MVC pattern to handle user interactions.
 */
@Controller
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    /**
     * Displays a list of all products.
     * 
     * @param model the model to hold product data
     * @return the name of the template to display
     */
    @GetMapping
    public String listProducts(Model model) {
        List<Product> products = productService.getAllProducts();
        model.addAttribute("products", products);
        return "product_list";
    }

    /**
     * Displays the form to add a new product.
     * 
     * @param model the model to hold the product form data
     * @return the name of the template to display
     */
    @GetMapping("/new")
    public String showAddProductForm(Model model) {
        model.addAttribute("product", new Product());
        return "product_form";
    }

    /**
     * Handles the submission of the form to add or update a product.
     * 
     * @param product the product to be saved
     * @return a redirect to the list of products
     */
    @PostMapping
    public String saveProduct(@ModelAttribute("product") Product product) {
        productService.saveProduct(product);
        return "redirect:/products";
    }

    /**
     * Displays the form to edit an existing product.
     * 
     * @param id    the ID of the product to edit
     * @param model the model to hold the product data
     * @return the name of the template to display
     */
    @GetMapping("/edit/{id}")
    public String showEditProductForm(@PathVariable("id") Long id, Model model) {
        Product product = productService.getProductById(id).orElseThrow(() -> new IllegalArgumentException("Invalid product Id:" + id));
        model.addAttribute("product", product);
        return "product_form";
    }

    /**
     * Handles the request to delete a product.
     * 
     * @param id the ID of the product to delete
     * @return a redirect to the list of products
     */
    @GetMapping("/delete/{id}")
    public String deleteProduct(@PathVariable("id") Long id) {
        productService.deleteProduct(id);
        return "redirect:/products";
    }
}
