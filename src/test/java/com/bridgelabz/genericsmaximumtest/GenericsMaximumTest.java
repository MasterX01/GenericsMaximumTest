package com.bridgelabz.genericsmaximumtest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GenericsMaximumTest {

    @Test
    public void givenIntegers_whenFirstNumberIsMax_ReturnSame() {
        Integer result = GenericsMaximum.testMax(5, 3, 2);
        Assertions.assertEquals(5, result);
    }

    @Test
    public void givenIntegers_whenSecondNumberIsMax_ReturnSame() {
        Integer result = GenericsMaximum.testMax(3, 5, 2);
        Assertions.assertEquals(5, result);
    }

    @Test
    public void givenIntegers_whenThirdNumberIsMax_ReturnSame() {
        Integer result = GenericsMaximum.testMax(2, 3, 5);
        Assertions.assertEquals(5, result);
    }

    @Test
    public void givenFloat_whenFirstNumberIsMax_ReturnSame() {
        Float result = GenericsMaximum.testMax(5.2f, 3.2f, 2.2f);
        Assertions.assertEquals(5.2f, result);
    }

    @Test
    public void givenFloat_whenSecondNumberIsMax_ReturnSame() {
        Float result = GenericsMaximum.testMax(3.2f, 5.2f, 2.2f);
        Assertions.assertEquals(5.2f, result);
    }

    @Test
    public void givenFloat_whenThirdNumberIsMax_ReturnSame() {
        Float result = GenericsMaximum.testMax(2.2f, 3.2f, 5.2f);
        Assertions.assertEquals(5.2f, result);
    }

    @Test
    public void givenString_whenFirstStringIsMax_ReturnSame() {
        String result = GenericsMaximum.testMax("Banana", "Apple", "Plum");
        Assertions.assertEquals("Plum", result);
    }

    @Test
    public void givenString_whenSecondStringIsMax_ReturnSame() {
        String result = GenericsMaximum.testMax("Apple", "Banana", "Plum");
        Assertions.assertEquals("Plum", result);
    }

    @Test
    public void givenString_whenThirdStringIsMax_ReturnSame() {
        String result = GenericsMaximum.testMax("Apple", "Plum", "Banana");
        Assertions.assertEquals("Plum", result);
    }
}
