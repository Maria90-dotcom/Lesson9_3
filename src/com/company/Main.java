package com.company;

public class Main {

    public static void main(String[] args) {
Person person1 = new Person("Sergey", 45);
Person person2 = new Person();
        System.out.println(person1.fullName+"  "+person1.age);
        System.out.println(person2.fullName+"  "+person2.age);
        person1.talk();
        person2.move();
    }
}
