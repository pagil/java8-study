package java8prj01.model;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Person {
    private String givenName;
    private String surName;
    private int age;
    private Gender gender;
    private String eMail;
    private String phone;
    private String address;

    public Person(String givenName, String surName, int age, Gender gender, String eMail, String phone, String address) {
        this.givenName = givenName;
        this.surName = surName;
        this.age = age;
        this.gender = gender;
        this.eMail = eMail;
        this.phone = phone;
        this.address = address;
    }

    public static List<Person> createShortList() {
        List<Person> people = new ArrayList<>();

        people.add(
                new Person.Builder()
                        .givenName("Bob")
                        .surName("Baker")
                        .age(21)
                        .gender(Gender.MALE)
                        .email("bob.baker@example.com")
                        .phoneNumber("201-121-4678")
                        .address("44 4th St, Smallville, KS 12333")
                        .build()
        );

        people.add(
                new Person.Builder()
                        .givenName("Jane")
                        .surName("Doe")
                        .age(25)
                        .gender(Gender.FEMALE)
                        .email("jane.doe@example.com")
                        .phoneNumber("202-123-4678")
                        .address("33 3rd St, Smallville, KS 12333")
                        .build()
        );
        people.add(
                new Person.Builder()
                        .givenName("John")
                        .surName("Doe")
                        .age(25)
                        .gender(Gender.MALE)
                        .email("john.doe@example.com")
                        .phoneNumber("202-123-4678")
                        .address("33 3rd St, Smallville, KS 12333")
                        .build()
        );
        return people;
    }

    public String printCustom(Function<Person, String> f) {
        return f.apply(this);
    }

    public String getGivenName() {
        return givenName;
    }

    public String getSurName() {
        return surName;
    }

    public int getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

    public String geteMail() {
        return eMail;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public enum Gender {
        MALE, FEMALE;
    }

    private static class Builder {

        private String givenName;
        private String surName;
        private int age;
        private Gender gender;
        private String eMail;
        private String phone;
        private String address;

        public Builder() {
        }


        public Builder givenName(String name) {
            givenName = name;
            return this;
        }

        public Builder surName(String surname) {
            surName = surname;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder gender(Gender gender) {
            this.gender = gender;
            return this;
        }

        public Builder email(String email) {
            this.eMail = email;
            return this;
        }

        public Builder phoneNumber(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public Person build() {
            return new Person(givenName, surName, age, gender, eMail, phone, address);
        }
    }


}