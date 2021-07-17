package com.day01;

import com.day01.TimeTool;

public class Test {
    /**
     * 求第n个斐波那契数
     * 斐波那契数列：这个数列从第3项开始，每一项都等于前两项之和。
     * 下标 0 1 2 3 4 5 6 7
     * 数列 0 1 1 2 3 5 8 13
     */
    //递归的方式：存在问题，当n为64就很慢
    //时间复杂度：其实就是看fun1方法被调用了多少次，调用了多少次就是执行了多少次，如果传入的是5调用fun1（4）和fun1（3）依次推导共调用O(2^n)
    public static long fun1(long n){
        if(n<=1) return n;
        return fun1(n-1)+fun1(n-2);
    }
    //时间复杂度：O(n)
    public static int fun2(int n){
        if(n<=1) return n;
        //n已经大于1
        int first=0;
        int second=1;
        //循环n需要添加几次呢？假设求下标为2的数字，需要加1次，求下标为3的数字，需要加2次，所以求下标为n的数字需要循环加n-1次
        for (int i = 0; i <n-1 ; i++) {
            //每次加都是前两个
            int sum=first+second;
            //相加之前second需要当作下一次相加的first
            first=second;
            //相加的结果要给下一个second
            second=sum;
            //但是两句不能交换，如果交换 sum赋值给second将second覆盖 second再复制给first就会产生逻辑错误
        }
        return second;
        //此时通过main方法测试该方法传入70很快就可以出结果 所以使用不同的算法解决同一个问题效率相差非常大，具体相差多大可以通过代码演示测算
    }

    public static void main(String[] args) {
      // System.out.println(fun1(60));
        int n=76;
//        TimeTool.check("fun1",new TimeTool.Task(){
//            public void execute(){
//                System.out.println(fun1(n));//递归
//            }
//        });

        TimeTool.check("fun2",new TimeTool.Task(){
            public void execute(){
                System.out.println(fun2(n));//循环
            }
        });

    }
}
