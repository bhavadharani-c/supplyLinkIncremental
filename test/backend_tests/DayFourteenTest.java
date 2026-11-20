package com.edutech.progressive;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.edutech.progressive.entity.Product;
import com.edutech.progressive.entity.Supplier;
import com.edutech.progressive.entity.Warehouse;
import com.edutech.progressive.repository.ProductRepository;
import com.edutech.progressive.repository.SupplierRepository;
import com.edutech.progressive.repository.WarehouseRepository;
import com.edutech.progressive.service.ProductService;
import com.edutech.progressive.service.SupplierService;
import com.edutech.progressive.service.WarehouseService;
import com.edutech.progressive.service.impl.ProductServiceImplJpa;
import com.edutech.progressive.service.impl.SupplierServiceImplJpa;
import com.edutech.progressive.service.impl.WarehouseServiceImplJpa;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = SupplyLinkApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
@ActiveProfiles("test")
public class DayFourteenTest {

    private ObjectMapper objectMapper;

    @Autowired
    ProductRepository productRepository;
    @Autowired
    SupplierRepository supplierRepository;
    @Autowired
    WarehouseRepository warehouseRepository;

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private WebApplicationContext webApplicationContext;

    @BeforeEach
    public void setUp() throws SQLException {
        objectMapper = new ObjectMapper();
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
        this.clearTestDatabase();
        MockitoAnnotations.openMocks(this);
    }

    private void clearTestDatabase() throws SQLException {
        final String url = "jdbc:mysql://localhost:3306/mydb";
        final String user = "root";
        final String password = "root";
        try (Connection connection = DriverManager.getConnection(url, user, password);
                PreparedStatement statement = connection.prepareStatement("DELETE FROM product")) {
            statement.executeUpdate();
        }

        try (Connection connection = DriverManager.getConnection(url, user, password);
                PreparedStatement statement = connection.prepareStatement("DELETE FROM warehouse")) {
            statement.executeUpdate();
        }

        try (Connection connection = DriverManager.getConnection(url, user, password);
                PreparedStatement statement = connection.prepareStatement("DELETE FROM supplier")) {
            statement.executeUpdate();
        }
    }

    // Helper classes to create Objects
    Supplier getSupplierObject(Integer id, String name, String email, String username) {
        Supplier supplier = new Supplier();
        if (id != null) {
            supplier.setSupplierId(id.intValue());
        }
        supplier.setSupplierName(name);
        supplier.setEmail(email);
        supplier.setUsername(username);
        supplier.setPassword("password");
        supplier.setPhone("9876543210");
        supplier.setAddress("California");
        return supplier;
    }

    Warehouse getWarehouseObject(Integer id, Supplier supplier, String warehouseName, String location, int capacity) {
        Warehouse warehouse = new Warehouse();
        if (id != null) {
            warehouse.setWarehouseId(id.intValue());
        }
        setDynamicProperty(warehouse, "supplier", supplier);
        warehouse.setWarehouseName(warehouseName);
        warehouse.setLocation(location);
        warehouse.setCapacity(capacity);
        return warehouse;
    }

    Product getProductObject(Integer productId, Warehouse warehouse, String name, int quantity, Long price) {
        Product product = new Product();
        if (productId != null) {
            product.setProductId(productId.intValue());
        }
        setDynamicProperty(product, "warehouse", warehouse);
        product.setProductName(name);
        product.setQuantity(quantity);
        product.setPrice(price);
        return product;
    }

    public void setDynamicProperty(Object entity, String propertyName, Object value) {
        try {
            Field field = entity.getClass().getDeclaredField(propertyName);
            field.setAccessible(true);
            field.set(entity, value);
        } catch (Exception e) {

        }
    }

    @Test
    void testGetAllWarehouse_Day14() throws SQLException {
        WarehouseService warehouseService = new WarehouseServiceImplJpa(warehouseRepository);
        SupplierService supplierService = new SupplierServiceImplJpa(supplierRepository);
        Supplier supplier1 = getSupplierObject(null, "John Doe", "john@example.com", "john");
        int id = supplierService.addSupplier(supplier1);
        supplier1.setSupplierId(id);
        Warehouse warehouses1 = getWarehouseObject(null, supplier1, "flamingo", "california", 100);
        Warehouse warehouses2 = getWarehouseObject(null, supplier1, "bottega", "taxas", 200);
        warehouseService.addWarehouse(warehouses1);
        warehouseService.addWarehouse(warehouses2);

        List<Warehouse> result = warehouseService.getAllWarehouses();

        assertNotNull(result);
        assertEquals(2, result.size());
    }

    @Test
    void testGetWarehousesBySupplier_Day14() throws SQLException {
        WarehouseService warehouseService = new WarehouseServiceImplJpa(warehouseRepository);
        SupplierService supplierService = new SupplierServiceImplJpa(supplierRepository);
        Supplier supplier1 = getSupplierObject(null, "John Doe", "john@example.com", "john");
        int id = supplierService.addSupplier(supplier1);
        supplier1.setSupplierId(id);
        Warehouse warehouses1 = getWarehouseObject(null, supplier1, "flamingo", "california", 100);
        int warehouseId = warehouseService.addWarehouse(warehouses1);

        List<Warehouse> result = warehouseService.getWarehouseBySupplier(id);

        assertNotNull(result);
        assertEquals(warehouseId, result.get(0).getWarehouseId());
    }

    @Test
    void testGetAllWarehouseSortedByCapacity_Day14() throws SQLException {
        WarehouseService warehouseService = new WarehouseServiceImplJpa(warehouseRepository);
        SupplierService supplierService = new SupplierServiceImplJpa(supplierRepository);
        Supplier supplier1 = getSupplierObject(null, "John Doe", "john@example.com", "john");
        int id = supplierService.addSupplier(supplier1);
        supplier1.setSupplierId(id);
        Warehouse warehouses1 = getWarehouseObject(null, supplier1, "flamingo", "california", 100);
        Warehouse warehouses2 = getWarehouseObject(null, supplier1, "bottega", "taxas", 200);
        Warehouse warehouses3 = getWarehouseObject(null, supplier1, "flames", "california", 300);
        warehouseService.addWarehouse(warehouses1);
        warehouseService.addWarehouse(warehouses2);
        warehouseService.addWarehouse(warehouses3);

        List<Warehouse> sortedWarehouse = warehouseService.getWarehousesSortedByCapacity();

        assertTrue(sortedWarehouse.get(0).getCapacity() > sortedWarehouse.get(1).getCapacity());
    }

    @Test
    public void testGetWarehousesBySupplierController_Day14() throws Exception {
        WarehouseService warehouseService = new WarehouseServiceImplJpa(warehouseRepository);
        SupplierService supplierService = new SupplierServiceImplJpa(supplierRepository);
        Supplier supplier1 = getSupplierObject(null, "John Doe", "john@example.com", "john");
        int id = supplierService.addSupplier(supplier1);
        supplier1.setSupplierId(id);
        Warehouse warehouses1 = getWarehouseObject(null, supplier1, "flamingo", "california", 100);
        warehouseService.addWarehouse(warehouses1);
        Warehouse warehouses2 = getWarehouseObject(null, supplier1, "bottega", "taxas", 200);
        warehouseService.addWarehouse(warehouses2);

        List<Warehouse> warehouses = warehouseService.getWarehouseBySupplier(id);
        mockMvc.perform(get("/warehouse/supplier/" + id).contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.size()").value(warehouses.size()));
    }

    @Test
    public void testAddWarehouseController_Day14() throws Exception {
        WarehouseService warehouseService = new WarehouseServiceImplJpa(warehouseRepository);
        SupplierService supplierService = new SupplierServiceImplJpa(supplierRepository);
        Supplier supplier1 = getSupplierObject(null, "John Doe", "john@example.com", "john");
        int id = supplierService.addSupplier(supplier1);
        supplier1.setSupplierId(id);
        Warehouse warehouses1 = getWarehouseObject(null, supplier1, "flamingo", "california", 100);

        mockMvc.perform(post("/warehouse")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(warehouses1)))
                .andExpect(status().isCreated());
    }

}
