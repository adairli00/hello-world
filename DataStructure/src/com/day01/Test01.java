package com.day01;

public class Test01 {
    //计算1到n的累加和
    public static int sum1(int n){
        int result=0;
        for (int i = 0; i <=n ; i++) {
            result+=i;
        }
        return result;
    }

    public static int sum2(int n){
        return(1+n)*n/2;
    }

    public static void sum3(int n) {
        int i = 1;
        int j = 2;
        int m = i + j;
    }
}
