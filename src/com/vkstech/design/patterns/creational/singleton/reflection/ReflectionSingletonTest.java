package com.vkstech.design.patterns.creational.singleton.reflection;

import com.vkstech.design.patterns.creational.singleton.EarlyInitialization;

import java.lang.reflect.Constructor;

//Reflection can be used to destroy some of the singleton implementation approaches.
public class ReflectionSingletonTest {

    public static void main(String[] args) {
        EarlyInitialization instanceOne = EarlyInitialization.getObj();
        EarlyInitialization instanceTwo = null;
        try {
            Constructor[] constructors = EarlyInitialization.class.getDeclaredConstructors();
            for (Constructor constructor : constructors) {
                //Below code will destroy the singleton pattern
                constructor.setAccessible(true);
                instanceTwo = (EarlyInitialization) constructor.newInstance();
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(instanceOne.hashCode());
        System.out.println(instanceTwo.hashCode());

        instanceOne.setA(10);
        instanceTwo.setA(20);
        System.out.println(instanceOne.getA());
        System.out.println(instanceTwo.getA());
    }

}
