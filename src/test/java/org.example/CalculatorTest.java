package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    void testAdd() {
        Calculator calculator = new Calculator();
        Assertions.assertEquals(5, calculator.add(2, 3));
    }

}
