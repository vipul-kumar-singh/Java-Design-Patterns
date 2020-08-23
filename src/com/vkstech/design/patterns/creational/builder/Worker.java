package com.vkstech.design.patterns.creational.builder;

public class Worker {

    private Long id;
    private String name;
    private String designation;
    private int age;

    public Worker() {
    }

    public Worker setId(Long id) {
        this.id = id;
        return this;
    }

    public Worker setName(String name) {
        this.name = name;
        return this;
    }

    public Worker setDesignation(String designation) {
        this.designation = designation;
        return this;
    }

    public Worker setAge(int age) {
        this.age = age;
        return this;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDesignation() {
        return designation;
    }

    public int getAge() {
        return age;
    }

    public Worker build() {
        //do some work
        System.out.println("Worker{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                ", age=" + age +
                '}');
        return this;
    }
}
