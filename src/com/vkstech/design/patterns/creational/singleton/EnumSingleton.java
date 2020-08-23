package com.vkstech.design.patterns.creational.singleton;

/**
 * To overcome the situation with Reflection,
 * Enum is used to implement Singleton design pattern as Java ensures that
 * any enum value is instantiated only once in a Java program.
 */

public enum EnumSingleton {

    INSTANCE;

    public static void doSomething() {
        //do something
    }
}
