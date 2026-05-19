package com.example.calculator.model;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void sumTest() {

        assertEquals(10.0, calculator.sum(5.0, 5.0));
    }

    @Test
    public void numbersNullSumTest() {

        assertThrows(NullPointerException.class, () -> {
            calculator.sum(null, null);
        });
    }

    @Test
    void subTest() {

        assertEquals(5.0, calculator.sub(10.0, 5.0));
    }

    @Test
    void divideTest() {

        assertEquals(2.0, calculator.divide(10.0, 5.0));
    }

    @Test
    public void divisionByZeroTest() {

        assertThrows(ArithmeticException.class, () -> {
            calculator.divide(10.0, 0.0);
        });
    }

    @Test
    void factorialTest() {

        assertEquals(120, calculator.factorial(5));
    }

    @Test
    void integerToBinaryTest() {

        assertEquals(101, calculator.integerToBinary(5));
    }

    @Test
    void integerToHexadecimalTest() {

        assertEquals("AA", calculator.integerToHexadecimal(170));
    }

    @Test
    void calculeDayBetweenDateTest() {

        LocalDate date1 = LocalDate.of(2020, 3, 15);
        LocalDate date2 = LocalDate.of(2020, 3, 29);

        assertEquals(14, calculator.calculeDayBetweenDate(date1, date2));
    }
}
