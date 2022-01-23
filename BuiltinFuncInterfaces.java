package com.company;

import java.util.Comparator;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class BuiltinFuncInterfaces {
    public static void main(String[] args) {

        Predicate<Integer> isPositive = i->i>0;
        System.out.println(isPositive.test(15));

        Predicate<Integer> isZero = i->i==0;
        System.out.println(isZero.test(15));

        Predicate<Integer> isNegative = isPositive.or(isZero).negate();
        System.out.println(isNegative.test(-15));



        Function<Person, String> getName = Person::getName;

        Function<String, Character> firstChar = s-> s.charAt(0);

        Function<Person, Character> firstCharName = getName.andThen(firstChar);
        System.out.println(firstCharName.apply(new Person("Евген", "Жук")));



        Supplier<Person> supplier = Person::new;
        Person person = supplier.get();
        System.out.println(person);



        Consumer<Person> grating = person1 -> System.out.println("Hello, " + person1.getName() + " matherFucker");
        grating.accept(new Person("Балалайка", "Аркадьевна"));



        Comparator<Person> comparator = (p1, p2)->p1.getName().compareTo(p2.getName());
        Person person1 = new Person("John", "Doe");
        Person person2 = new Person("Alice", "Krige");
        System.out.println(
                comparator.compare
                        (person1, person2));



        Optional<String> isEmpty = Optional.empty();
        if (! isEmpty.isEmpty())
            System.out.println(isEmpty.get());


        Optional<String> isNotEmpty = Optional.of(" ");
        isNotEmpty.ifPresent(s->System.out.println(isNotEmpty.isPresent()));


        Optional<String> optional = Optional.ofNullable(null);
        System.out.println(optional.isPresent());
    }
}
