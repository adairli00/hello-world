package com.text;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;

public class Sort {
    public static void selectSort(Integer[] ints){
        for (int i = 0; i < ints.length - 1; i++) {
            for (int j =i +1 ; j<ints.length;j++){
                int min = i;
                if (ints[j]<ints[i]){
                    min = j;
                }
                exch(ints,i,min);

            }
        }

    }
    public static void insertSort(Integer[] ints){
        for (int i = 0; i <ints.length ; i++) {
            for (int j =i; j>0;j--){
                if (greater(ints[j-1],ints[j])){
                    exch(ints,j,j-1);

                }else {break;}
            }

        }
    }
    public static void shellSort(Integer[] ints){
        //找到h
        int h =1;
        while (h<ints.length/2) {
            h = 2*h+1;
        }
        //控制h进行排序
        while (h>=1){
            for (int i = h; i < ints.length;  i++) {
                for (int j = i; j >= h; j=j-h) {
                    if (greater(ints[j - h], ints[j])) {
                        exch(ints, j, j - h);

                    } else {
                        break;
                    }
                }
            }
            h = h/2;

        }

    }
//    ------------------------------------------------------------------------------------------------------------------
    //归并辅助数组
    private static Comparable[] assist;

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
    //对数组a中的元素进行排序
    public static void sort(Comparable[] a){
            assist = new Comparable[a.length];
            int lo =0;
            int hi = a.length -1;
            sort(a,lo,hi);

    }
    private static void sort(Comparable[] a ,int lo,int hi){
        if (lo>=hi){
            return;
        }
        //lo--hi数据分2组
        int mid = lo+(hi-lo)/2;
        //每一组排序
        sort(a,lo,mid);
        sort(a,mid+1,hi);
        //两个组的数据归并
        merge(a,lo,mid,hi);

    }
    private static void merge(Comparable[] a ,int lo,int mid , int hi ){
        int i = lo;
        int p1 = lo;
        int p2 = mid+1;
        while (p1<=mid && p2<=hi){
            if ( less(a[p1],a[p2])){
                assist[i++] = a[p1++];
            }else {
                assist[i++] = a[p2++];
            }
        }
        while (p1<=mid){
            assist[i++] = a[p1++];
        }
        while (p2<=hi){
            assist[i++] = a[p2++];
        }
        for (int index = lo; index <=hi ; index++) {
            a[index] = assist[index];

        }
    }
//    ------------------------------------------------------------------------------------------------------------------

    public static void main(String[] args) {
        Integer[] nums =   {2,3,3,5,9,6,1};
        //selectSort(nums);
        //insertSort(nums);
        //shellSort(nums);
        //sort(nums);
       // QuickSort.sort(nums);
       // System.out.println(Arrays.toString(nums));
       // HashMap integerHashMap = new HashMap<>();

        int n = 1;
        int x = 0;
        x = ++n;
        System.out.println("x is "+x+","+"n is "+n);

//        int [] a = {1,2,3,4,5};
//        System.out.println(a.length);
//        int i = a[a.length-1];
//        System.out.println(i);

    }

}
