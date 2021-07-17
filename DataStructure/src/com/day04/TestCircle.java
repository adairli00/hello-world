package com.day04;

public class TestCircle {
    public static void main(String[] args) {
        LinkedListDoubleCircle db=new LinkedListDoubleCircle();
        db.add(22);
        db.add(33);
        db.add(44);
        db.add(1,66);//[22,66,33,44]
        System.out.println(db);
        db.remove(0);
        System.out.println(db);//[66,33,44]
    }
}
