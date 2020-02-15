package ru.kirill.unit_2_1;

public class Person {

    static byte numberOfEyes = 2;

    String name;
    String surname;

    byte age;

    Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
        //System.out.println("!Constructor invoked!");
    }

    String sayYourName() {
        return name + " " + surname + " " + age;
    }

    byte getNumberOfEyes() {
        return numberOfEyes;
    }

    Person getMyLink() {
        return this;
    }
}
