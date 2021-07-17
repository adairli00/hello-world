package com.day02;

import com.day02.DynamicArray;
import com.day02.Student;

public class TestDy {
    public static void main(String[] args) {
        DynamicArray<String> list = new DynamicArray(1);
        list.add("sdas");
        list.add("32143");
        DynamicArray<Student> stuList = new DynamicArray<>();
        Student st1 = new Student(1, "张三", 4);
        Student st2 = new Student(2, "李四", 23);
        Student st3 = new Student(3, "赵六", 17);
        stuList.add(st1);
        stuList.add(null);
        System.out.println(stuList.contains(null));
        System.out.println(stuList.indexOf(null));
        stuList.add(st2);
        stuList.add(st3);
        System.out.println(stuList.toString());
    }
}
