package com.example.coding.serialization;

import java.io.Serializable;

public class User implements Serializable {

    // assign serialVersionUID or it gets generated
    private static final long serialVersionUID = 1;

    String name;

    // should not be serialized
    transient String password;

    public void sayHello() {
        System.out.println("Hello " + name);
    }
}
