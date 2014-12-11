package java8prj01;

import java8prj01.model.Person;

public class MethodReference {

    public static void main(String[] args) {
        Person.createShortList().stream().map(Person::getGivenName).sorted().forEach(System.out::println);
    }
}
