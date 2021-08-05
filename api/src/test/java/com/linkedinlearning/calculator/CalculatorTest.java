package com.linkedinlearning.calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

// Using junit dependency jupiter
public class CalculatorTest {
    private final Calculator calculator = new Calculator();

    @Test
    void canAdd() {
        assertEquals(3, calculator.add(1,2));
    }

    @Test
    void canSubtract() {
        assertEquals(1, calculator.subtract(2,1));
    }

    @Test
    void canMultiply() {
        assertEquals(6, calculator.multiply(3,2));
    }

    @Test
    void canDivide() {
        assertEquals(3, calculator.divide(6,2));
    }
}
