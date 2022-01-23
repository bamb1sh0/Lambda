package com.company;

import java.util.*;

public class Intro {
    public static void main(String[] args) {
        List <Person> persons = Arrays.asList(new Person("Ivan", "Ivanov"),
                new Person("Alex", "Ivanov"),
                new Person("Petr", "Ivanov"),
                new Person("Alexey", "Alexeev"));

        /**
         Collections.sort(persons, new Comparator<Person>() {
        @Override
        public int compare(Person p1, Person p2) {
        int result = p1.getSurname().compareTo(p2.getSurname());
        if (result != 0){
        return result;
        }
        else return p1.getName().compareToIgnoreCase(p2.getName());
        }
        });
         persons.forEach(person -> System.out.println(person));
         **/

        /**
         Collections.sort(persons, (Person p1, Person p2) -> {return p1.getSurname().compareTo(p2.getSurname());});
         persons.forEach(System.out :: println);
         **/
        /**
         Collections.sort(persons, (Person p1, Person p2) -> p1.getSurname().compareTo(p2.getSurname()));
         persons.forEach(System.out :: println);
         **/
        /**
         Collections.sort(persons, (p1, p2) -> p1.getSurname().compareTo(p2.getSurname()));
         persons.forEach(System.out :: println);
         **/
        /**
         Collections.sort(persons, (p1, p2) -> p1.getSurname().compareTo(p2.getSurname())
         != 0 ? p1.getSurname().compareTo(p2.getSurname()) :
         p1.getName().compareTo(p2.getName()));
         persons.forEach(System.out :: println);
         **/
        Collections.sort(persons,
                (p1, p2) -> {int result = p1.getSurname().compareTo(p2.getSurname());
                    return result != 0 ? result :
                            p1.getName().compareTo(p2.getName());});
        persons.forEach(System.out :: println);
    }
}
