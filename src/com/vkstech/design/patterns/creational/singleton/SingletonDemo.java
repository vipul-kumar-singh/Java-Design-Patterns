package com.vkstech.design.patterns.creational.singleton;

public class SingletonDemo {

    public static void main(String[] args) {

        //Early Initialization
        EarlyInitialization eObj1 = EarlyInitialization.getObj();

        eObj1.setA(10);
        System.out.println(eObj1.getA());

        EarlyInitialization eObj2 = EarlyInitialization.getObj();

        System.out.println(eObj2.getA());


        //Lazy Initialization
        LazyInitialization lObj1 = LazyInitialization.getObj();

        lObj1.setA(20);
        System.out.println(lObj1.getA());

        LazyInitialization lObj2 = LazyInitialization.getObj();

        System.out.println(lObj2.getA());

        //StaticBlockInitialization
        StaticBlockInitialization sObj1 = StaticBlockInitialization.getObj();

        sObj1.setA(30);
        System.out.println(sObj1.getA());

        StaticBlockInitialization sObj2 = StaticBlockInitialization.getObj();

        System.out.println(sObj2.getA());
    }
}
