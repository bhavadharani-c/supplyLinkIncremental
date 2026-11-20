package com.edutech.progressive.dao;
import java.util.ArrayList;
import java.util.List;
import com.edutech.progressive.entity.Warehouse;

public class WarehouseDAOImpl implements WarehouseDAO {
    @Override 
    public int addWarehouse(Warehouse warehouse){
        return -1;
    }
    @Override
    public Warehouse getWarehouseById(int warehouseId){
        return null;
    }
    @Override 
    public void updateWarehouse(Warehouse warehouse){
        return;
    }
    @Override 
    public void deleteWarehouse(int warehouseId){
        return;
    }
    @Override
    public List<Warehouse> getAllWarehouse(){
        return new ArrayList<>();

    }


}
