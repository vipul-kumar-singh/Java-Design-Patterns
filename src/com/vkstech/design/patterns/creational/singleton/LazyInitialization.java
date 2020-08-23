package com.vkstech.design.patterns.creational.singleton;

import java.util.Objects;

public class LazyInitialization {

    private int a;
    private static LazyInitialization obj;

    private LazyInitialization(){
        //Empty private constructor
    }

    //Public getter;
    public static LazyInitialization getObj() {
        if (Objects.isNull(obj))
            obj = new LazyInitialization();
        return obj;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
}
