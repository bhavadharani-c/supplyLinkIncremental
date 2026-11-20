package com.edutech.progressive;
import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import static org.junit.jupiter.api.Assertions.*;

public class DayNineTest {

@Test
public void testSpringBootApplicationAnnotationAndWelcomeMessage() throws Exception {

    
    assertTrue(SupplyLinkApplication.class.isAnnotationPresent(SpringBootApplication.class),
            "@SpringBootApplication annotation is missing");
    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    PrintStream originalOut = System.out;
    try {
        System.setOut(new PrintStream(outputStream));        
        SupplyLinkApplication.class.getDeclaredMethod("main", String[].class);
    } finally {
        System.setOut(originalOut);
    }
    assertTrue(SupplyLinkApplication.class
                    .getDeclaredMethod("main", String[].class) != null,
            "main method is missing"
    );
}
}