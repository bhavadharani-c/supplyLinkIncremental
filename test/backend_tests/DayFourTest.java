package com.edutech.progressive;

import org.junit.jupiter.api.Test;

import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class DayFourTest {

        @Test
        public void testInterfaceImplementation() throws Exception {

                String productDAO = Files.readString(
                                Path.of("src/main/java/com/edutech/progressive/dao/ProductDAOImpl.java"));

                String supplierDAO = Files.readString(
                                Path.of("src/main/java/com/edutech/progressive/dao/SupplierDAOImpl.java"));

                String warehouseDAO = Files.readString(
                                Path.of("src/main/java/com/edutech/progressive/dao/WarehouseDAOImpl.java"));

                assertTrue(productDAO.contains("implements ProductDAO"));
                assertTrue(supplierDAO.contains("implements SupplierDAO"));
                assertTrue(warehouseDAO.contains("implements WarehouseDAO"));
        }

        @Test
        public void testListConcept() throws Exception {

                String productDAO = Files.readString(
                                Path.of("src/main/java/com/edutech/progressive/dao/ProductDAOImpl.java"));

                String supplierDAO = Files.readString(
                                Path.of("src/main/java/com/edutech/progressive/dao/SupplierDAOImpl.java"));

                String warehouseDAO = Files.readString(
                                Path.of("src/main/java/com/edutech/progressive/dao/WarehouseDAOImpl.java"));

                assertTrue(productDAO.contains("List<Product>"));
                assertTrue(supplierDAO.contains("List<Supplier>"));
                assertTrue(warehouseDAO.contains("List<Warehouse>"));
        }

        @Test
        public void testServiceInterfaceConcept() throws Exception {

                String productService = Files.readString(
                                Path.of("src/main/java/com/edutech/progressive/service/impl/ProductServiceImplJdbc.java"));

                String supplierService = Files.readString(
                                Path.of("src/main/java/com/edutech/progressive/service/impl/SupplierServiceImplJdbc.java"));

                String warehouseService = Files.readString(
                                Path.of("src/main/java/com/edutech/progressive/service/impl/WarehouseServiceImplJdbc.java"));

                assertTrue(productService.contains("implements ProductService"));
                assertTrue(supplierService.contains("implements SupplierService"));
                assertTrue(warehouseService.contains("implements WarehouseService"));
        }
}