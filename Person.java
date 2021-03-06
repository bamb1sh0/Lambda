package com.company;

public class Person {
    private String name;
    private String surname;

    public Person(){}

    public Person(String name, String surname) {

        this.name
                = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String toString(){
        return String.format("[%s, %s]",name,surname);
    }
}
