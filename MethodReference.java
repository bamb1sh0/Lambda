package com.company;

public class MethodReference {
    public static void main(String[] args) {
        Converter<String, Integer> converter = Integer :: valueOf;
        Integer i = converter.convert("2");
        System.out.println(i);

        Converter<Integer, String> converter1 = String :: valueOf;
        String s = converter1.convert(3);
        System.out.println(s);

        Converter<String, Character> converter2 = StringsOperations :: firstChar;
        System.out.println(converter2.convert("Белые башмаки"));

        PersonFactory<Person> personFactory = Person::new;
        Person person = personFactory.create("Kirill","Shabanov");
        System.out.println(person);
    }
}
@FunctionalInterface
interface Converter<S, T>{
    T convert(S obj);
}
class StringsOperations{
    public static Character firstChar(String s){
        return s.charAt(0);
    }
}
interface PersonFactory<P extends Person>{
    P create (String name, String Surname);
}
