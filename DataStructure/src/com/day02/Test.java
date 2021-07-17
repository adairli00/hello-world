package com.day02;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList array=new ArrayList();
//        array.add(null);
//        array.add(11);
//        System.out.println(array.toString());
        DynamicArray list=new DynamicArray(10);
        list.add(99);
        list.add(88);
        list.add(44);
        list.add(55);
        list.add(77);
        list.add(99);
        list.add(90);
        list.add(23);
        list.add(24);
        list.add(35);
        System.out.println(list.toString());
        list.add(89);
        list.add(100);
        System.out.println(list.toString());//length=15
        list.remove(2);
        list.remove(3);
        list.remove(4);
        list.remove(5);
        System.out.println(list.toString());
        list.remove(6);
        System.out.println(list.toString());//7=15/2

    }
}
