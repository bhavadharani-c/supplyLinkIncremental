package com.edutech.progressive.service.impl;
import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;
import com.edutech.progressive.entity.Supplier;
import com.edutech.progressive.service.SupplierService;
public class SupplierServiceImplArraylist implements SupplierService  {
    private static List<Supplier> supplierList= new ArrayList<>();
    @Override
    public List<Supplier> getAllSuppliers(){
        //List<Supplier> result = new ArrayList<>();
        //return result;
        return supplierList;
    }
    @Override 
    public int addSupplier(Supplier supplier){
        //return -1;
        supplierList.add(supplier);
        return supplierList.size();
    }
    @Override 
    public List<Supplier> getAllSuppliersSortedByName(){
        //List<Supplier> result = new ArrayList<>();
        //return result;
        List<Supplier> sortedSupplierList = new ArrayList<>(supplierList);
        Comparator<Supplier> supplierName = (s1,s2) -> s1.getSupplierName().compareTo(s2.getSupplierName());
        sortedSupplierList.sort(supplierName);
        return sortedSupplierList;
    }
    public void emptyArrayList(){
        supplierList= new ArrayList<>();
    }

}