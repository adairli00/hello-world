package com.day01;

public class Test02 {

    public void cal01(int age) {//O(1)常数阶
        //1*unit-time
        if(age>58){//unit-time
            System.out.println("阿姨");
        }else if (age>28){
            System.out.println("小姐姐");
        }else{
            System.out.println("美少女");
        }
    }
    int cal02(int n) {//T(n)=O(n)线性阶
        //3+3n
        int sum = 0;//执行1次
        int i = 1;//执行1次
        //    执行n次 执行n次
        for (; i <= n; ++i) {
            sum = sum + i;//执行n次
        }
        return sum;//执行1次
    }
    public void cal03(int n) {//T(n)=O(n)
        //1+3n
        for (int i = 0; i < n; i++) {
            System.out.println("关阿姨");//n
        }
    }

    public void cal04(int n) {//T(n)=O(n^2)平方阶
        //1+2n+n*(1+3n)=3n^2+3n+1
        for (int i = 0; i < n; i++) {//1+2n
            for (int j = 0; j < n; j++) {//1+3n
                for (int m = 0; m < n; m++) {//1+3n
                    System.out.println("guan");
                }
            }
        }
    }
    //公式中的低阶、常量、系数三部分
    public void cal05(int n) {//T(n)=O(n)
        //1+2n+n*(1+20+20+20)=1+2n+61n=1+63n
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.println("guan");
            }
        }
    }
    public void cal06(int n) {//T(n)=O(logn)对数阶
        //log(2)n;
        int i = 1;//1*unit-time
        while(i<n){
            //执行多少次？假设循环x次之后，i就大于n了跳出循环了，也就是说 2的x次方等于n，那么x =log以2为底的n次方
            i = i * 2;//每次都乘以2
        }
    }
    public void cal07(int n) {
        //i+=i相当于i=i+i=2i相当于i=i*2 每次都乘以2,看乘以多少次后大于n 所以执行log2(n)次后大于n，
        //所以外层循环执行1+2*log2(n)次，内层循环执行log2(n)*(1+3n)次
        //所以共执行1+2*log2(n)+log2(n)*(1+3n)=1+3*log2(n)+2*nlog2(n)
        //T(n)=O(nlogn)线性对数阶
        for (int i = 1; i <n ; i+=i) {//i=i+i=2*i  1+2log(2)n
            //(1+3n)*log(2)n
            for (int j = 0; j < n; j++) {
                System.out.println("ayi");
            }
        }
    }

    public void cal08(int n) {
        //T(n)=O(n^2)
        int sum = 0;//1
        int i = 1;//1
        int j = 1;//1
        for (; i <= n; ++i) {//3n
            j = 1;
            for (; j <= n; ++j) {//3n
                sum = sum + i * j;
            }
        }
    }

    public int Function(int n, int x){
        int sum = 0;
        for (int i = 1; i <= n; ++i){
            if (i == x)
                break;
            sum += i;
        }
        return sum;
    }

}
