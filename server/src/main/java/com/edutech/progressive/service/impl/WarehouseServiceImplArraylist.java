package com.edutech.progressive.service.impl;
import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;
import com.edutech.progressive.entity.Warehouse;
import com.edutech.progressive.service.WarehouseService;

public class WarehouseServiceImplArraylist implements WarehouseService  {
    private static List<Warehouse> warehouseList = new ArrayList<>();
    @Override 
    public List<Warehouse> getAllWarehouses(){
        //List<Warehouse> warehouses = new ArrayList<>();
        //return warehouses;
        return warehouseList;
    }
    @Override 
    public int addWarehouse(Warehouse warehouse){
        //return -1;
        warehouseList.add(warehouse);
        return warehouseList.size();
    }
    @Override
    public List<Warehouse> getWarehousesSortedByCapacity(){
        //List<Warehouse> warehouses = new ArrayList<>();
        List<Warehouse> sortedWarehouseList = new ArrayList<>(warehouseList);
        //return warehouses;
        Comparator<Warehouse> capacityComparator = (w1,w2) -> Integer.compare(w1.getCapacity(),w2.getCapacity());
        sortedWarehouseList.sort(capacityComparator);
        return sortedWarehouseList;
    }
    public void emptyArrayList(){
        warehouseList = new ArrayList<>();
        
    }

}