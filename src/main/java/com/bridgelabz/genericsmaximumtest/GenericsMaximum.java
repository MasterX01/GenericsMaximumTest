package com.bridgelabz.genericsmaximumtest;

public class GenericsMaximum<T extends Comparable<T>> {

    T x, y, z;
    T max;
    public GenericsMaximum(T x, T y, T z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public T testMax(){
        max = x;
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
