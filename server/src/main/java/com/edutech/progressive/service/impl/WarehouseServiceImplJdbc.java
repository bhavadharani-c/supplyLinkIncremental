package com.edutech.progressive.service.impl;
import java.util.ArrayList;
import java.util.List;
import com.edutech.progressive.dao.WarehouseDAO;
import com.edutech.progressive.entity.Warehouse;
import com.edutech.progressive.service.WarehouseService;
public class WarehouseServiceImplJdbc implements WarehouseService  {
    private WarehouseDAO warehouseDAO;
    public WarehouseServiceImplJdbc(WarehouseDAO warehouseDAO) {
        this.warehouseDAO = warehouseDAO;
    }
    @Override 
    public List<Warehouse> getAllWarehouses(){
        List<Warehouse> result = new ArrayList<>();
        return result;
    }
    @Override 
    public int addWarehouse(Warehouse warehouse){
        return -1;
    }
    @Override
    public List<Warehouse> getWarehousesSortedByCapacity(){
        List<Warehouse> result= new ArrayList<>();
        return result;
    }
    public void updateWarehouse(Warehouse warehouse){

    }
    public void deleteWarehouse(int warehouseId){

    }
    public Warehouse getWarehouseById(int warehouseId){
        return null;
    }
    public List<Warehouse> getWarehouseBySupplier(int supplierId){
        List<Warehouse> warehouses = new ArrayList<>();
        return warehouses;
    }
    


















}