package com.example.coding.generics;

/*
Number:
- Integer
- Double
- Float
 */
public class NumericFunctions <T extends Number>{

    T object;

    NumericFunctions(T object) {
        this.object = object;
    }

    double square() {
        return object.doubleValue() * object.doubleValue();
    }
}
