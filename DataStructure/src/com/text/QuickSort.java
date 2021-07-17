package com.text;

public class QuickSort {
    public static boolean greater (Comparable v ,Comparable m){
        return v.compareTo(m)>0;
    }
    public static boolean less(Comparable v,Comparable m){
        return v.compareTo(m)<0;
    }
    public static void exch(Comparable[] keys ,int i,int j ){

        Comparable temp = keys[i];
        keys [i] = keys[j];
        keys[j] = temp;

    }
    public static void sort(Comparable[] a){

        int lo =0;
        int hi = a.length -1;
        sort(a,lo,hi);

    }
    private static void sort(Comparable[] a ,int lo,int hi){
        if (lo>=hi){
            return;
        }
        //lo--hi数据分2组
        int partation = partation(a, lo, hi);
        //两个组的数据归并
        sort(a,lo,partation-1);
        sort(a,partation+1,hi);
    }
    private static int partation(Comparable[] a,int lo,int hi){

        Comparable key = a[lo];
        int left = lo;
        int right = hi +1;
        while(true){
            while (less(key,a[--right])){
                if (right == lo){
                    break;
                }
            }
            while (less(a[++left],key)){
                if (left == hi){
                    break;
                }
            }
            if (left>=right){
                break;
            }else {
                exch(a,left,right);
            }
        }
        exch(a,lo,right);


        return right;
    }
}
