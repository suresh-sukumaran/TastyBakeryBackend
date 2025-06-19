package com.bakery.tastybakery;
import com.bakery.tastybakery.model.Product;
import com.bakery.tastybakery.service.ProductService;
import java.util.List;
import java.io.IOException;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class ProductServiceTest {
    @InjectMocks
    private ProductService productService;

    @Test
    public void testGetAllProducts() throws IOException {
        List<Product> products = productService.getAllProducts();
        assertNotNull(products);
        assertFalse(products.isEmpty());
    }
}