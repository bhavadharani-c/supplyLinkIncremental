package com.edutech.progressive;

import com.edutech.progressive.entity.Product;
import com.edutech.progressive.entity.Supplier;
import com.edutech.progressive.entity.Warehouse;
import org.junit.jupiter.api.Test;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class DayElevenTest {

    @Test
    public void testEntityIdAndGeneratedValueAnnotations() {

        Class<?>[] entityClasses = {
                Product.class,
                Supplier.class,
                Warehouse.class
        };

        for (Class<?> entityClass : entityClasses) {

            
            assertTrue(
                    entityClass.isAnnotationPresent(Entity.class),
                    entityClass.getSimpleName()
                            + " must have @Entity annotation");

            boolean idFound = false;
            boolean generatedValueFound = false;

            
            for (Field field : entityClass.getDeclaredFields()) {

                if (field.isAnnotationPresent(Id.class)) {

                    idFound = true;

                    if (field.isAnnotationPresent(GeneratedValue.class)) {
                        generatedValueFound = true;
                    }
                }
            }

            
            assertTrue(
                    idFound,
                    entityClass.getSimpleName()
                            + " must have @Id annotation"
            );

            
            assertTrue(
                    generatedValueFound,
                    entityClass.getSimpleName()
                            + " @Id field must have @GeneratedValue annotation"
            );
        }
    }
}