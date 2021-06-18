package com.example.coding.generics;

public class WildcardNumFnc<T extends Number> {

    T num;

    WildcardNumFnc(T num) {
        this.num = num;
    }

    // can be different number type -> ?
    boolean isGreater(NumericFunctions<?> numF) {
        return num.doubleValue() > numF.object.doubleValue();
    }
}
