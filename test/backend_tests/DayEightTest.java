package com.edutech.progressive;

import com.edutech.progressive.dao.WarehouseDAO;
import com.edutech.progressive.entity.Warehouse;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class DayEightTest {

    @Test
    public void testGetWarehouseByIdJdbcOperation() throws SQLException {

        Warehouse expectedWarehouse =
                new Warehouse(1, 101, "Flamingo Warehouse",
                        "Chennai", 500);

        WarehouseDAO warehouseDAO = new WarehouseDAO() {

            @Override
            public int addWarehouse(Warehouse warehouse) {
                return 1;
            }

            @Override
            public Warehouse getWarehouseById(int warehouseId) {
                return expectedWarehouse;
            }

            @Override
            public void updateWarehouse(Warehouse warehouse) {
            }

            @Override
            public void deleteWarehouse(int warehouseId) {
            }

            @Override
            public List<Warehouse> getAllWarehouse() {
                return List.of(expectedWarehouse);
            }
        };

        Warehouse result = warehouseDAO.getWarehouseById(1);

        assertNotNull(result);
        assertEquals(1, result.getWarehouseId());
        assertEquals(101, result.getSupplierId());
        assertEquals("Flamingo Warehouse", result.getWarehouseName());
        assertEquals(500, result.getCapacity());
    }


    @Test
    public void testGetAllWarehouseJdbcOperation() throws SQLException {

        List<Warehouse> expectedWarehouses = List.of(
                new Warehouse(1, 101,
                        "Flamingo Warehouse",
                        "Chennai", 500),

                new Warehouse(2, 102,
                        "Cactus Warehouse",
                        "Bangalore", 300)
        );

        WarehouseDAO warehouseDAO = new WarehouseDAO() {

            @Override
            public int addWarehouse(Warehouse warehouse) {
                return -1;
            }

            @Override
            public Warehouse getWarehouseById(int warehouseId) {
                return null;
            }

            @Override
            public void updateWarehouse(Warehouse warehouse) {
            }

            @Override
            public void deleteWarehouse(int warehouseId) {
            }

            @Override
            public List<Warehouse> getAllWarehouse() {
                return expectedWarehouses;
            }
        };

        List<Warehouse> result = warehouseDAO.getAllWarehouse();

        assertNotNull(result);
        assertEquals(2, result.size());
        assertEquals("Flamingo Warehouse",
                result.get(0).getWarehouseName());
        assertEquals("Cactus Warehouse",
                result.get(1).getWarehouseName());
    }
}