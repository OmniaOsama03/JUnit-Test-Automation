package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    @DisplayName("Adding 2 numbers")
    void add()
    {
        //With the fail message
        assertTrue(5 == Calculator.add(2, 3), "Addition calculation is incorrect!");

        //Without the fail message
        assertTrue(5 == Calculator.add(2, 3));
    }
}