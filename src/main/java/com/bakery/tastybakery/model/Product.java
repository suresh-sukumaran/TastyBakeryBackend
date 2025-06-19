// Created by: [Your Name]
// Date: [Current Date]
package com.bakery.tastybakery.model;
import lombok.Data;

@Data
public class Product {
    private Long id;
    private String name;
    private String category; // "cake", "cookie", etc.
    private double price;
    private String size; // "1kg", "500g", etc.
    private String offer; // "10% off"
    private String imagePath; // "/images/cake1.jpg"
}