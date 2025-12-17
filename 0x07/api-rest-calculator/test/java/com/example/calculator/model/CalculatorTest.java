package com.example.calculator.model;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    void sumTest() {
        assertEquals(Double.valueOf(30.0), calculator.sum(10.0, 20.0));
    }

    @Test
    public void numbersNullSumTest() {
        NullPointerException ex = assertThrows(NullPointerException.class, () -> calculator.sum(null, 1.0));
        assertEquals("Número 1 e número 2 são obrigatórios.", ex.getMessage());
    }

    @Test
    void subTest() {
        assertEquals(Double.valueOf(7.0), calculator.sub(10.0, 3.0));
    }

    @Test
    void divideTest() {
        assertEquals(Double.valueOf(5.0), calculator.divide(10.0, 2.0));
    }

    @Test
    public void divisionByZeroTest() {
        ArithmeticException ex = assertThrows(ArithmeticException.class, () -> calculator.divide(10.0, 0.0));
        assertEquals("Divisão por zero não é permitido.", ex.getMessage());
    }

    @Test
    void factorialTest() {
        assertEquals(Integer.valueOf(120), calculator.factorial(5));
    }

    @Test
    void integerToBinaryTest() {
        assertEquals(Integer.valueOf(101), calculator.integerToBinary(5));
    }

    @Test
    void integerToHexadecimalTest() {
        assertEquals("AA", calculator.integerToHexadecimal(170));
    }

    @Test
    void calculeDayBetweenDateTest() {
        LocalDate d1 = LocalDate.of(2020, 3, 15);
        LocalDate d2 = LocalDate.of(2020, 3, 29);
        assertEquals(14, calculator.calculeDayBetweenDate(d1, d2));
    }

}