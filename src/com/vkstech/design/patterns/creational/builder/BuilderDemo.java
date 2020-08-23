package com.vkstech.design.patterns.creational.builder;

public class BuilderDemo {

    public static void main(String[] args) {
        Worker worker = new Worker()
                .setId(123L)
                .setName("Ghanshyam")
                .setAge(35)
                .setDesignation("Site Inspector")
                .build();
    }
}
