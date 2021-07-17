package com.text;

public class TextFactorial {
    public static void main(String[] args) {
        long factorial = factorial(100000000);
        System.out.println(factorial);
    }
    public static long factorial(int n){
        if (n == 1){
            return 1;
        }


        return n*factorial(n-1);
    }
 }
