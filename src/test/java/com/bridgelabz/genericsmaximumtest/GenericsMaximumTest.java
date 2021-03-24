package com.bridgelabz.genericsmaximumtest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GenericsMaximumTest {

    GenericsMaximum genericsMaximum = new GenericsMaximum();

    @Test
    public void givenIntegers_whenFirstNumberIsMax_ReturnSame() {
        Integer result = genericsMaximum.testMax(5, 3, 2);
        Assertions.assertEquals(5, result);
    }

    @Test
    public void givenIntegers_whenSecondNumberIsMax_ReturnSame() {
        Integer result = genericsMaximum.testMax(3, 5, 2);
        Assertions.assertEquals(5, result);
    }

    @Test
    public void givenIntegers_whenThirdNumberIsMax_ReturnSame() {
        Integer result = genericsMaximum.testMax(2, 3, 5);
        Assertions.assertEquals(5, result);
    }

    @Test
    public void givenFloat_whenFirstNumberIsMax_ReturnSame() {
        Float result = genericsMaximum.testMax(5.2f, 3.2f, 2.2f);
        Assertions.assertEquals(5.2f, result);
    }

    @Test
    public void givenFloat_whenSecondNumberIsMax_ReturnSame() {
        Float result = genericsMaximum.testMax(3.2f, 5.2f, 2.2f);
        Assertions.assertEquals(5.2f, result);
    }

    @Test
    public void givenIntegers_whenThirdIntegerIsMax_ReturnSame() {
        Float result = genericsMaximum.testMax(2.2f, 3.2f, 5.2f);
        Assertions.assertEquals(5.2f, result);
    }
}
