package com.bridgelabz.genericsmaximumtest;

public class GenericsMaximum {

    public static <T extends Comparable<T>> T testMax(T x, T y, T z){
        T max = x;
        if(y.compareTo(max) > 0)
            max = y;
        if(z.compareTo(max) > 0)
            max = z;
        return max;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Generics Maximum Program");
        //System.out.println(testMax(1, 2, 3));
    }
}
