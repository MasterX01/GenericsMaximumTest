package com.bridgelabz.genericsmaximumtest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GenericsMaximumTest {

    GenericsMaximum genericsMaximum = new GenericsMaximum();

    @Test
    public void givenIntegers_whenFirstIntegerIsMax_ReturnSame() {
        Integer result = genericsMaximum.testMax(5, 3, 2);
        Assertions.assertEquals(5, result);
    }

    @Test
    public void givenIntegers_whenSecondIntegerIsMax_ReturnSame() {
        Integer result = genericsMaximum.testMax(3, 5, 2);
        Assertions.assertEquals(5, result);
    }

    @Test
    public void givenIntegers_whenThirdIntegerIsMax_ReturnSame() {
        Integer result = genericsMaximum.testMax(2, 3, 5);
        Assertions.assertEquals(5, result);
    }

}
