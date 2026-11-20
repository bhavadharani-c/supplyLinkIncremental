package com.edutech.progressive;

import org.junit.jupiter.api.Test;

import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class DayThreeTest {

    @Test
    public void testExceptionHandlingWritten() throws Exception {

        String source = Files.readString(
                Path.of("src/main/java/com/edutech/progressive/config/DatabaseConnectionManager.java")
        );

        assertTrue(
                source.contains("throw new IllegalStateException"),
                "IllegalStateException is not written"
        );

        assertTrue(
                source.contains("catch (IOException"),
                "IOException catch block is not written"
        );
    }
}