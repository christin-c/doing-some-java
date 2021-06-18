package com.example.coding.generics;

public class Main {

    public static void main(String[] args) {
        MyClass<Integer> obj = new MyClass<>(10);
        MyClass<Double> obj2 = new MyClass<>(20.5);

        obj.showType();
        obj2.showType();

        MyClass2<String, Integer> si = new MyClass2<>("Hello Nr.", 2);
        System.out.println(si.object1 + si.object2.toString());


        NumericFunctions<Integer> Ob = new NumericFunctions<>(4);
        System.out.println("Square: " + Ob.square());

        WildcardNumFnc<Integer> wildcardNumFnc = new WildcardNumFnc<>(5);
        NumericFunctions<Double> numericDouble = new NumericFunctions<>(4.5);

        System.out.println("is greater: " + wildcardNumFnc.isGreater(numericDouble));
    }
}
