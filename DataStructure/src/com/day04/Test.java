package com.day04;

import com.day03.LinkedList;

public class Test {
    public static void main(String[] args) {
        //LinkedListDouble doulist=new LinkedListDouble<>();
        LinkedListSingelCircle sc=new LinkedListSingelCircle();
        sc.add(11);
        sc.add(22);
        sc.add(33);
        System.out.println(sc);
        sc.add(0,44);
        System.out.println(sc);
        sc.remove(1);
        System.out.println(sc);

    }
}
