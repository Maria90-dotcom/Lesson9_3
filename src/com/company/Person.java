package com.company;

public class Person {
    String fullName;
    int age;

    Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    Person() {
        this("Анжела", 37);
    }

    void move() {
        System.out.println("Анжела поет");
    }
    void talk(){
        System.out.println("Сергей говорит");
    }
}
