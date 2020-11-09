package com.cognitree.levelops.codebuild;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    public void test() {
        Calculator calc = new Calculator();
        assertEquals(5, calc.add(2, 3));
        assertEquals(1, calc.subtract(3, 2));
        assertEquals(6, calc.multiply(2, 3));
        assertEquals(2, calc.divide(4, 2));
    }
}
