
import com.edutech.progressive.entity.Product;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DayOneTest {

    @Test
    public void testDefaultConstructor() {
        Product product = new Product();

        assertNotNull(product);
    }

    @Test
    public void testParameterizedConstructor() {
        Product product = new Product(
                1,
                101,
                "Laptop",
                "Dell Laptop",
                10,
                55000L
        );

        assertEquals(1, product.getProductId());
        assertEquals(101, product.getWarehouseId());
        assertEquals("Laptop", product.getProductName());
        assertEquals("Dell Laptop", product.getProductDescription());
        assertEquals(10, product.getQuantity());
        assertEquals(55000L, product.getPrice());
    }
}