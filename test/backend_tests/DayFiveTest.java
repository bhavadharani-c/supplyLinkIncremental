
package com.edutech.progressive;

import com.edutech.progressive.entity.Supplier;
import com.edutech.progressive.entity.Warehouse;
import com.edutech.progressive.service.impl.SupplierServiceImplArraylist;
import com.edutech.progressive.service.impl.WarehouseServiceImplArraylist;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class DayFiveTest {

    @Test
    public void testSupplierComparableByName() {

        Supplier supplier1 = new Supplier(
                1, "John", "john@gmail.com",
                "9876543210", "Chennai",
                "john", "password", "SUPPLIER"
        );

        Supplier supplier2 = new Supplier(
                2, "Alice", "alice@gmail.com",
                "9876543211", "Chennai",
                "alice", "password", "SUPPLIER"
        );

        assertTrue(supplier2.compareTo(supplier1) < 0);
        assertTrue(supplier1.compareTo(supplier2) > 0);
    }

    @Test
    public void testWarehouseComparableByCapacity() {

        Warehouse warehouse1 =
                new Warehouse(1, 1, "Warehouse A", "Chennai", 100);

        Warehouse warehouse2 =
                new Warehouse(2, 1, "Warehouse B", "Chennai", 300);

        assertTrue(warehouse2.compareTo(warehouse1) < 0);
        assertTrue(warehouse1.compareTo(warehouse2) > 0);
    }

    @Test
    public void testSupplierComparatorSortingByName() {

        SupplierServiceImplArraylist service =
                new SupplierServiceImplArraylist();

        service.emptyArrayList();

        service.addSupplier(new Supplier(
                1, "John", "john@gmail.com",
                "9876543210", "Chennai",
                "john", "password", "SUPPLIER"
        ));

        service.addSupplier(new Supplier(
                2, "Alice", "alice@gmail.com",
                "9876543211", "Chennai",
                "alice", "password", "SUPPLIER"
        ));

        service.addSupplier(new Supplier(
                3, "Bob", "bob@gmail.com",
                "9876543212", "Chennai",
                "bob", "password", "SUPPLIER"
        ));

        List<Supplier> result =
                service.getAllSuppliersSortedByName();

        assertEquals("Alice", result.get(0).getSupplierName());
        assertEquals("Bob", result.get(1).getSupplierName());
        assertEquals("John", result.get(2).getSupplierName());
    }

    @Test
    public void testWarehouseComparatorSortingByCapacity() {

        WarehouseServiceImplArraylist service =
                new WarehouseServiceImplArraylist();

        service.emptyArrayList();

        service.addWarehouse(
                new Warehouse(1, 1, "Warehouse A", "Chennai", 300)
        );

        service.addWarehouse(
                new Warehouse(2, 1, "Warehouse B", "Chennai", 100)
        );

        service.addWarehouse(
                new Warehouse(3, 1, "Warehouse C", "Chennai", 200)
        );

        List<Warehouse> result =
                service.getWarehousesSortedByCapacity();

        assertEquals(100, result.get(0).getCapacity());
        assertEquals(200, result.get(1).getCapacity());
        assertEquals(300, result.get(2).getCapacity());
    }
}

