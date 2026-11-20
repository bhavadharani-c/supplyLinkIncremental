package com.edutech.progressive;

import com.edutech.progressive.entity.Supplier;
import com.edutech.progressive.entity.Warehouse;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DayTwoTest {

    @Test
    public void testSupplierDefaultConstructor() {
        Supplier supplier = new Supplier();

        assertNotNull(supplier);
    }

    @Test
    public void testSupplierParameterizedConstructor() {
        Supplier supplier = new Supplier(
                1,
                "John Doe",
                "john@gmail.com",
                "9876543210",
                "Chennai",
                "john",
                "password",
                "SUPPLIER"
        );

        assertEquals(1, supplier.getSupplierId());
        assertEquals("John Doe", supplier.getSupplierName());
        assertEquals("john@gmail.com", supplier.getEmail());
        assertEquals("9876543210", supplier.getPhone());
        assertEquals("Chennai", supplier.getAddress());
        assertEquals("john", supplier.getUsername());
        assertEquals("password", supplier.getPassword());
        assertEquals("SUPPLIER", supplier.getRole());
    }

    @Test
    public void testWarehouseDefaultConstructor() {
        Warehouse warehouse = new Warehouse();

        assertNotNull(warehouse);
    }

    @Test
    public void testWarehouseParameterizedConstructor() {
        Warehouse warehouse = new Warehouse(
                1,
                101,
                "Flamingo Warehouse",
                "California",
                500
        );

        assertEquals(1, warehouse.getWarehouseId());
        assertEquals(101, warehouse.getSupplierId());
        assertEquals("Flamingo Warehouse", warehouse.getWarehouseName());
        assertEquals("California", warehouse.getLocation());
        assertEquals(500, warehouse.getCapacity());
    }
}

