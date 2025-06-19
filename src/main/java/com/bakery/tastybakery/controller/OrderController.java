// Created by: [Your Name]
// Date: [Date]
package com.bakery.tastybakery.controller;

import com.bakery.tastybakery.model.OrderDetails;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private static final Logger logger = LoggerFactory.getLogger(OrderController.class);

    @PostMapping
    public ResponseEntity<String> createOrder(@RequestBody OrderDetails order) {
        logger.info("Received order: {}", order);
        // Add logic to process the order
        return ResponseEntity.ok("Order received");
    }
}