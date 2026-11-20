package com.edutech.progressive;

import com.edutech.progressive.dao.SupplierDAO;
import com.edutech.progressive.entity.Supplier;
import com.edutech.progressive.service.impl.SupplierServiceImplJdbc;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class DaySevenTest {

    @Test
    public void testAddSupplierJdbcOperation() throws SQLException {

        SupplierDAO supplierDAO = new SupplierDAO() {

            @Override
            public int addSupplier(Supplier supplier) {
                return 1;
            }

            @Override
            public Supplier getSupplierById(int supplierId) {
                return null;
            }

            @Override
            public void updateSupplier(Supplier supplier) {
            }

            @Override
            public void deleteSupplier(int supplierId) {
            }

            @Override
            public List<Supplier> getAllSuppliers() {
                return List.of();
            }
        };

        SupplierServiceImplJdbc service = new SupplierServiceImplJdbc(supplierDAO);

        Supplier supplier = new Supplier(
                0,
                "John",
                "john@gmail.com",
                "9876543210",
                "Chennai",
                "john",
                "password",
                "SUPPLIER");

        int result = service.addSupplier(supplier);

        assertEquals(1, result);
    }

    @Test
    public void testGetSupplierByIdJdbcOperation() throws SQLException {

        Supplier expectedSupplier = new Supplier(
                1,
                "John",
                "john@gmail.com",
                "9876543210",
                "Chennai",
                "john",
                "password",
                "SUPPLIER");

        SupplierDAO supplierDAO = new SupplierDAO() {

            @Override
            public int addSupplier(Supplier supplier) {
                return -1;
            }

            @Override
            public Supplier getSupplierById(int supplierId) {
                return expectedSupplier;
            }

            @Override
            public void updateSupplier(Supplier supplier) {
            }

            @Override
            public void deleteSupplier(int supplierId) {
            }

            @Override
            public List<Supplier> getAllSuppliers() {
                return List.of();
            }
        };

        SupplierServiceImplJdbc service = new SupplierServiceImplJdbc(supplierDAO);

        Supplier result = service.getSupplierById(1);

        assertNotNull(result);
        assertEquals(1, result.getSupplierId());
        assertEquals("John", result.getSupplierName());
        assertEquals("john@gmail.com", result.getEmail());
    }

    
}
