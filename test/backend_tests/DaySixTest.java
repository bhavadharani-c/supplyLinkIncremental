package com.edutech.progressive;
import com.edutech.progressive.dao.ProductDAO;
import com.edutech.progressive.entity.Product;
import com.edutech.progressive.service.impl.ProductServiceImplJdbc;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class DaySixTest {

    @Test
    public void testAddProductJdbcOperation() throws SQLException {

        ProductDAO productDAO = new ProductDAO() {

            @Override
            public int addProduct(Product product) {
                return 1;
            }

            @Override
            public Product getProductById(int productId) {
                return null;
            }

            @Override
            public void updateProduct(Product product) {
            }

            @Override
            public void deleteProduct(int productId) {
            }

            @Override
            public List<Product> getAllProducts() {
                return List.of();
            }
        };

        ProductServiceImplJdbc service = new ProductServiceImplJdbc(productDAO);

        Product product = new Product(
                0, 101, "Laptop",
                "Dell Laptop", 10, 50000L);

        int result = service.addProduct(product);

        assertEquals(1, result);
    }

    @Test
    public void testGetProductByIdJdbcOperation() throws SQLException {

        Product expectedProduct = new Product(
                1, 101, "Laptop",
                "Dell Laptop", 10, 50000L);

        ProductDAO productDAO = new ProductDAO() {

            @Override
            public int addProduct(Product product) {
                return -1;
            }

            @Override
            public Product getProductById(int productId) {
                return expectedProduct;
            }

            @Override
            public void updateProduct(Product product) {
            }

            @Override
            public void deleteProduct(int productId) {
            }

            @Override
            public List<Product> getAllProducts() {
                return List.of();
            }
        };

        ProductServiceImplJdbc service = new ProductServiceImplJdbc(productDAO);

        Product result = service.getProductById(1);

        assertNotNull(result);
        assertEquals(1, result.getProductId());
        assertEquals("Laptop", result.getProductName());
    }

    @Test
    public void testGetAllProductsJdbcOperation() throws SQLException {

        List<Product> expectedProducts = List.of(
                new Product(1, 101, "Laptop",
                        "Dell Laptop", 10, 50000L),
                new Product(2, 101, "Mouse",
                        "Wireless Mouse", 20, 1000L)
        );

        ProductDAO productDAO = new ProductDAO() {

            @Override
            public int addProduct(Product product) {
                return -1;
            }

            @Override
            public Product getProductById(int productId) {
                return null;
            }

            @Override
            public void updateProduct(Product product) {
            }

            @Override
            public void deleteProduct(int productId) {
            }

            @Override
            public List<Product> getAllProducts() {
                return expectedProducts;
            }
        };

        ProductServiceImplJdbc service =
                new ProductServiceImplJdbc(productDAO);

        List<Product> result = service.getAllProducts();

        assertNotNull(result);
        assertEquals(2, result.size());
        assertEquals("Laptop", result.get(0).getProductName());
        assertEquals("Mouse", result.get(1).getProductName());
    }
}
