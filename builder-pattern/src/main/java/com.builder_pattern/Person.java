package com.builder_pattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Person {

    private String name;
    private String surname;
    private int age;
    private Gender gender;
    private List<Person> friends;

    private Person(){
        friends = new ArrayList<Person>();
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

    public List<Person> getFriends() {
        return friends;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return getAge() == person.getAge() &&
                Objects.equals(getName(), person.getName()) &&
                Objects.equals(getSurname(), person.getSurname()) &&
                getGender() == person.getGender() &&
                Objects.equals(getFriends(), person.getFriends());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSurname(), getAge(), getGender(), getFriends());
    }

    public static NeedName builder() {
        return new PersonBuilder();
    }

    private static final class PersonBuilder implements NeedName, NeedSurname, NeedAge, NeedGender, NeedFriend, CanBeBuild {

        private Person instance;

        private PersonBuilder() {
            this.instance = new Person();
        }


        public NeedSurname name(String name) {
            this.instance.name = name;
            return this;
        }

        public NeedGender surname(String surname) {
            this.instance.surname = surname;
            return this;
        }

        public NeedAge gender(Gender gender) {
            this.instance.gender = gender;
            return this;
        }

        public NeedFriend age(int age) {
            this.instance.age = age;
            return this;
        }

        public NeedFriend addFriend(Person friend) {
            this.instance.friends.add(friend);
            return this;
        }

        @Override
        public CanBeBuild addFriends(List<Person> friends) {
            this.instance.friends.addAll(friends);
            return this;
        }

        public CanBeBuild and() {
            return this;
        }

        public Person build() {
            return instance;
        }

    }

    public interface NeedName {
        NeedSurname name(String name);
    }

    public interface NeedSurname {
        NeedGender surname(String surname);
    }

    public interface NeedGender {
        NeedAge gender(Gender gender);
    }
    public interface NeedAge {
        NeedFriend age(int age);
    }

    public interface NeedFriend{

        NeedFriend addFriend(Person friend);

        CanBeBuild addFriends(List<Person> friends);

        CanBeBuild and();
    }

    public interface CanBeBuild {
        Person build();
    }
}
