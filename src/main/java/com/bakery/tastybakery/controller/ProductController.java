
package com.bakery.tastybakery.controller;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bakery.tastybakery.model.Product;
import com.bakery.tastybakery.service.ProductService;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping
    public List<Product> getAllProducts() {
        try {
            return productService.getAllProducts();
        } catch (StreamReadException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (DatabindException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }

        @GetMapping("/category")
    public List<Product> getProductsByCategory(@RequestParam String category) {
        try {
            return productService.getProductsByCategory(category);
        } catch (StreamReadException e) {
            e.printStackTrace();
        } catch (DatabindException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}