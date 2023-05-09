package org.example.exam1.exceptions;

public class Temp {

    public int ranN1, ranN2, result;

    public static void main(String[] args) {
        int a = adder(0);
        int b = adder(1);
        int c = adder(2);
        int d = adder(3);
        int e = adder(4);

        System.out.println("a is .. " + a);
        System.out.println("b is .. " + b);
        System.out.println("c is .. " + c);
        System.out.println("d is .. " + d);
        System.out.println("e is .. " + e);
    }

    public static int adder(int v) {
        return v++;
    }
}
