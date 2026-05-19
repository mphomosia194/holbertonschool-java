package com.example.calculator.model;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Calculator {

    public Double sum(Double number1, Double number2) {

        if (number1 == null || number2 == null) {
            throw new NullPointerException("Number 1 and Number 2 are required.");
        }

        return number1 + number2;
    }

    public Double sub(Double number1, Double number2) {

        if (number1 == null || number2 == null) {
            throw new NullPointerException("Number 1 and Number 2 are required.");
        }

        return number1 - number2;
    }

    public Double divide(Double number1, Double number2) {

        if (number1 == null || number2 == null) {
            throw new NullPointerException("Number 1 and Number 2 are required.");
        }

        if (number2 == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }

        return number1 / number2;
    }

    public Integer factorial(Integer factorial) {

        if (factorial == null) {
            throw new NullPointerException("Number is required.");
        }

        int result = 1;

        for (int i = 1; i <= factorial; i++) {
            result *= i;
        }

        return result;
    }

    public Integer integerToBinary(Integer integer) {

        return Integer.valueOf(Integer.toBinaryString(integer));
    }

    public String integerToHexadecimal(Integer integer) {

        return Integer.toHexString(integer).toUpperCase();
    }

    public int calculeDayBetweenDate(LocalDate date1, LocalDate date2) {

        return (int) ChronoUnit.DAYS.between(date1, date2);
    }
}
