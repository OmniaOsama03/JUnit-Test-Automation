package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

    /*
       JUnit test cases for getGrade(int score)
       Based on Base Choice Coverage (BCC) defined in Assignment 2.
       Each test case corresponds to a specific block variation from the BCC test set (TC1–TC7).
       
     */

class GradeCalculatorTest
{
    //TC1: RV1 + GC3 (input score = 75)
    @Test
    void testBaseCase_CGrade() {
        assertEquals("C", GradeCalculator.getGrade(75));
    }

    //TC2: RV2 varied, triggers GC6 (input score = -10)
    @Test
    void testInvalidInput_NegativeScore() {
        assertEquals("Invalid", GradeCalculator.getGrade(-10));
    }

    //TC3: RV1 + GC1 (input score = 95)
    @Test
    void testAGrade() {
        assertEquals("A", GradeCalculator.getGrade(95));
    }

    //TC4: RV1 + GC2 (input score = 85)
    @Test
    void testBGrade() {
        assertEquals("B", GradeCalculator.getGrade(85));
    }

    //TC5: RV1 + GC4 (input score = 65)
    @Test
    void testDGrade() {
        assertEquals("D", GradeCalculator.getGrade(65));
    }

    //TC6: RV1 + GC5 (input score = 40)
    @Test
    void testFGrade() {
        assertEquals("F", GradeCalculator.getGrade(40));
    }

    //TC7: GC6 varied, triggers RV2 (input score = 105)
    @Test
    void testInvalidInput_TooHigh() {
        assertEquals("Invalid", GradeCalculator.getGrade(105));
    }
}
