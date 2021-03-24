package com.bridgelabz.genericsmaximumtest;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GenericsMaximumTest {

    @Test
    public void givenIntegers_whenFirstNumberIsMax_ReturnSame() {
        GenericsMaximum<Integer> integerGenericsMaximum = new GenericsMaximum<Integer>();
        Integer result = integerGenericsMaximum.testMax(5, 3, 2);
        Assertions.assertEquals(5, result);
    }

    @Test
    public void givenIntegers_whenSecondNumberIsMax_ReturnSame() {
        GenericsMaximum<Integer> integerGenericsMaximum = new GenericsMaximum<Integer>();
        Integer result = integerGenericsMaximum.testMax(3, 5, 2);
        Assertions.assertEquals(5, result);
    }

    @Test
    public void givenIntegers_whenThirdNumberIsMax_ReturnSame() {
        GenericsMaximum<Integer> integerGenericsMaximum = new GenericsMaximum<Integer>();
        Integer result = integerGenericsMaximum.testMax(3, 2, 5);
        Assertions.assertEquals(5, result);
    }

    @Test
    public void givenFloat_whenFirstNumberIsMax_ReturnSame() {
        GenericsMaximum<Float> floatGenericsMaximum = new GenericsMaximum<Float>();
        Float result = floatGenericsMaximum.testMax(5.2f, 3.2f, 2.2f);
        Assertions.assertEquals(5.2f, result);
    }

    @Test
    public void givenFloat_whenSecondNumberIsMax_ReturnSame() {
        GenericsMaximum<Float> floatGenericsMaximum = new GenericsMaximum<Float>();
        Float result = floatGenericsMaximum.testMax(3.2f, 5.2f, 2.2f);
        Assertions.assertEquals(5.2f, result);
    }

    @Test
    public void givenFloat_whenThirdNumberIsMax_ReturnSame() {
        GenericsMaximum<Float> floatGenericsMaximum = new GenericsMaximum<Float>();
        Float result = floatGenericsMaximum.testMax(3.2f, 2.2f, 5.2f);
        Assertions.assertEquals(5.2f, result);
    }

    @Test
    public void givenString_whenFirstStringIsMax_ReturnSame() {
        GenericsMaximum<String> stringGenericsMaximum = new GenericsMaximum<String>();
        String result = stringGenericsMaximum.testMax("Plum", "Apple", "Banana");
        Assertions.assertEquals("Plum", result);
    }

    @Test
    public void givenString_whenSecondStringIsMax_ReturnSame() {
        GenericsMaximum<String> stringGenericsMaximum = new GenericsMaximum<String>();
        String result = stringGenericsMaximum.testMax("Apple", "Plum", "Banana");
        Assertions.assertEquals("Plum", result);
    }

    @Test
    public void givenString_whenThirdStringIsMax_ReturnSame() {
        GenericsMaximum<String> stringGenericsMaximum = new GenericsMaximum<String>();
        String result = stringGenericsMaximum.testMax("Banana", "Apple", "Plum");
        Assertions.assertEquals("Plum", result);
    }
}
