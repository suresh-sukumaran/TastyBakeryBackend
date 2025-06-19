package com.bakery.tastybakery.model;

import lombok.Data;
import java.util.List;

@Data
public class OrderDetails {
    private Long id;
    private String customerName;
    private String customerAddress;
    private String customerPhone;
    private List<Product> products; // List of products in the order
    private double totalPrice; // Total price of the order
    private String status; // "pending", "completed", etc.

}