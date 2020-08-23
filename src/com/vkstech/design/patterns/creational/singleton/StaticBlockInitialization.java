package com.vkstech.design.patterns.creational.singleton;

//A variant of Early Initialization
public class StaticBlockInitialization {

    private static StaticBlockInitialization obj;

    private int a;

    private StaticBlockInitialization(){}

    static{
            obj = new StaticBlockInitialization();
    }

    public static StaticBlockInitialization getObj(){
        return obj;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
}
