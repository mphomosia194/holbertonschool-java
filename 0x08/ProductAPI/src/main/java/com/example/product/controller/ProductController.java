package com.example.product.controller;

import com.example.product.model.Product;
import com.example.product.model.ProductRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/products")
@Api(value = "Product API REST")
public class ProductController {

    @Autowired
    private ProductRepository repository;

    @GetMapping("/welcome")
    @ApiOperation(value = "Displays welcome message")
    public String welcome() {

        return "WELCOME TO PRODUCT REST API.";
    }

    @GetMapping("/allProducts")
    @ApiOperation(value = "Lists all products")
    @ApiResponses(value = {
            @ApiResponse(code = 11,
                    message = "Warning - the process returned more than 1000 products.")
    })
    public List<Product> allProducts() {

        return repository.getAllProducts();
    }

    @GetMapping("/findProductById/{id}")
    @ApiOperation(value = "Finds product by ID")
    @ApiResponses(value = {
            @ApiResponse(code = 12,
                    message = "The field id not informed. This information is required.")
    })
    public Product findProductById(@PathVariable Long id) {

        return repository.getProductById(id);
    }

    @PostMapping("/addProduct")
    @ApiOperation(value = "Adds a new product")
    @ApiResponses(value = {
            @ApiResponse(code = 10,
                    message = "Required fields not informed.")
    })
    public void addProduct(@RequestBody Product product) {

        repository.addProduct(product);
    }

    @PutMapping("/updateProduct")
    @ApiOperation(value = "Updates a product")
    @ApiResponses(value = {
            @ApiResponse(code = 14,
                    message = "No information has been updated. The new information is the same as recorded in the database.")
    })
    public void updateProduct(@RequestBody Product product) {

        repository.updateProduct(product);
    }

    @DeleteMapping("/removeProduct")
    @ApiOperation(value = "Removes a product")
    @ApiResponses(value = {
            @ApiResponse(code = 13,
                    message = "User not allowed to remove a product from this category.")
    })
    public void removeProduct(@RequestBody Product product) {

        repository.removeProduct(product);
    }
}
