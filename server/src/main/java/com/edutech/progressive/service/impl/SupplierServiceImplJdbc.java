package com.edutech.progressive.service.impl;
import java.util.ArrayList;
import java.util.List;
import com.edutech.progressive.dao.SupplierDAO;
import com.edutech.progressive.entity.Supplier;
import com.edutech.progressive.service.SupplierService;

public class SupplierServiceImplJdbc implements SupplierService  {
    private SupplierDAO supplierDAO;

    public SupplierServiceImplJdbc(SupplierDAO supplierDAO) {
        this.supplierDAO = supplierDAO;
    }
    @Override 
    public List<Supplier> getAllSuppliers(){
        List<Supplier> suppliers = new ArrayList<>();
        return suppliers;
    }
    @Override 
    public int addSupplier(Supplier supplier){
        return -1;
    }
    @Override
    public List<Supplier> getAllSuppliersSortedByName(){
        List<Supplier> suppliers = new ArrayList<>();
        return suppliers;
    }
    public void updateSupplier(Supplier supplier){

    }
    public void deleteSupplier(int supplierId){

    }
    public Supplier getSupplierById(int supplierId){
        return null;
    }

}