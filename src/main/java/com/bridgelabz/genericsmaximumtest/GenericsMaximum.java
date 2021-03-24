package com.bridgelabz.genericsmaximumtest;

import java.util.Arrays;

public class GenericsMaximum<T extends Comparable<T>> {

    T max;

    public T testMax(T...args){
        Arrays.sort(args);
        max = args[args.length - 1];
        return max;
    }

    public void printMax() {
        System.out.println(max);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Generics Maximum Program");
        //System.out.println(testMax(1, 2, 3));
    }
}
