package org.example;

import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;



class MainTest {

    @Test
    @DisplayName("Add two numbers")
    void add()
    {
        assertEquals(4, Main.add(2, 2));
    }

    @Test
    @DisplayName("Multiply two numbers")
    void multiply() {
        assertAll(() -> assertEquals(4, Main.multiply(2, 2)),
                () -> assertEquals(-4, Main.multiply(2, -2)),
                () -> assertEquals(4, Main.multiply(-2, -2)),
                () -> assertEquals(0, Main.multiply(1, 0)));
    }
}