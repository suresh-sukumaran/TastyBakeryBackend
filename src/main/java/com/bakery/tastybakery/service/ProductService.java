
package com.bakery.tastybakery.service;
import com.bakery.tastybakery.model.Product;
import com.bakery.tastybakery.service.ProductService;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.core.type.TypeReference;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
import java.io.File;
import java.io.IOException;
@Service
public class ProductService {
    private static final String JSON_FILE = "src/main/resources/products.json";
    
    public List<Product> getAllProducts() throws StreamReadException, DatabindException, IOException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(new File(JSON_FILE), new TypeReference<List<Product>>() {});
    }
    public List<Product> getProductsByCategory(String category) throws StreamReadException, DatabindException, IOException {
        ObjectMapper mapper = new ObjectMapper();
        List<Product> products = mapper.readValue(new File(JSON_FILE), new TypeReference<List<Product>>() {});
            return products.stream()
                       .filter(product -> product.getCategory().equalsIgnoreCase(category))
                       .toList();
    }

}