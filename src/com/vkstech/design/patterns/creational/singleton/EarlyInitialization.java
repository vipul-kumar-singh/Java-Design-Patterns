package com.vkstech.design.patterns.creational.singleton;

public class EarlyInitialization {

    private int a;

    //Early, instance will be created at load time
    private static EarlyInitialization obj =new EarlyInitialization();

    private EarlyInitialization(){
        //Empty private constructor
    }

    public static EarlyInitialization getObj() {
        //Public getter;
        return obj;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
}
