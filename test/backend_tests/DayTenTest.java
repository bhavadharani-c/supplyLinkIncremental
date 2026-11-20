package com.edutech.progressive;

import com.edutech.progressive.controller.ProductController;
import com.edutech.progressive.controller.SupplierController;
import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.*;

public class DayTenTest {

    @Test
    public void testProductControllerRestControllerAndResponseEntity() {
    
        assertTrue(
            ProductController.class.isAnnotationPresent(RestController.class),
            "ProductController must use @RestController"
        );
    
        for (Method method : ProductController.class.getDeclaredMethods()) {
            assertEquals(
                ResponseEntity.class,
                method.getReturnType(),
                "Method " + method.getName() + " must return ResponseEntity"
            );
        }
    }
    
    @Test
    public void testSupplierControllerRestControllerAndResponseEntity() {
    
        assertTrue(
            SupplierController.class.isAnnotationPresent(RestController.class),
            "SupplierController must use @RestController"
        );
    
        for (Method method : SupplierController.class.getDeclaredMethods()) {
            assertEquals(
                ResponseEntity.class,
                method.getReturnType(),
                "Method " + method.getName() + " must return ResponseEntity"
            );
        }
    }
}