package com.bridgelabz.genericsmaximumtest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GenericsMaximumTest {

    @Test
    public void givenIntegers_whenFirstNumberIsMax_ReturnSame() {
        GenericsMaximum<Integer> integerGenericsMaximum = new GenericsMaximum<Integer>(5,3,2);
        Integer result = integerGenericsMaximum.testMax();
        Assertions.assertEquals(5, result);
    }

    @Test
    public void givenIntegers_whenSecondNumberIsMax_ReturnSame() {
        GenericsMaximum<Integer> integerGenericsMaximum = new GenericsMaximum<Integer>(3,5,2);
        Integer result = integerGenericsMaximum.testMax();
        Assertions.assertEquals(5, result);
    }

    @Test
    public void givenIntegers_whenThirdNumberIsMax_ReturnSame() {
        GenericsMaximum<Integer> integerGenericsMaximum = new GenericsMaximum<Integer>(3,2,5);
        Integer result = integerGenericsMaximum.testMax();
        Assertions.assertEquals(5, result);
    }

    @Test
    public void givenFloat_whenFirstNumberIsMax_ReturnSame() {
        GenericsMaximum<Float> floatGenericsMaximum = new GenericsMaximum<Float>(5.2f, 3.2f, 2.2f);
        Float result = floatGenericsMaximum.testMax();
        Assertions.assertEquals(5.2f, result);
    }

    @Test
    public void givenFloat_whenSecondNumberIsMax_ReturnSame() {
        GenericsMaximum<Float> floatGenericsMaximum = new GenericsMaximum<Float>(3.2f, 5.2f, 2.2f);
        Float result = floatGenericsMaximum.testMax();
        Assertions.assertEquals(5.2f, result);
    }

    @Test
    public void givenFloat_whenThirdNumberIsMax_ReturnSame() {
        GenericsMaximum<Float> floatGenericsMaximum = new GenericsMaximum<Float>(3.2f, 2.2f, 5.2f);
        Float result = floatGenericsMaximum.testMax();
        Assertions.assertEquals(5.2f, result);
    }

    @Test
    public void givenString_whenFirstStringIsMax_ReturnSame() {
        GenericsMaximum<String> stringGenericsMaximum = new GenericsMaximum<String>("Plum", "Apple", "Banana");
        String result = stringGenericsMaximum.testMax();
        Assertions.assertEquals("Plum", result);
    }

    @Test
    public void givenString_whenSecondStringIsMax_ReturnSame() {
        GenericsMaximum<String> stringGenericsMaximum = new GenericsMaximum<String>("Apple", "Plum", "Banana");
        String result = stringGenericsMaximum.testMax();
        Assertions.assertEquals("Plum", result);
    }

    @Test
    public void givenString_whenThirdStringIsMax_ReturnSame() {
        GenericsMaximum<String> stringGenericsMaximum = new GenericsMaximum<String>("Banana", "Apple", "Plum");
        String result = stringGenericsMaximum.testMax();
        Assertions.assertEquals("Plum", result);
    }
}
