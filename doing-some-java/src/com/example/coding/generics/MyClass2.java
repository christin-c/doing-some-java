package com.example.coding.generics;

public class MyClass2 <T, V> {
    T object1;
    V object2;

    MyClass2(T object1, V object2) {
        this.object1 = object1;
        this.object2 = object2;
    }

    void showTypeOfObject1() {
        System.out.println(object1.getClass().getName());
    }

    void showTypeOfObject2() {
        System.out.println(object2.getClass().getName());
    }

}
