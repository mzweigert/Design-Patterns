package com.builder_pattern;


import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class PersonBuilderTest {

    @Test
    public void testPersonBuilder() {
        // GIVEN
        String expectedPersonName = "PersonName";
        String expectedPersonSurname = "PersonSurname";
        Gender expectedPersonGender = Gender.FEMALE;
        int expectedPersonAge = 50;
        List<Person> friends = createFriends(10);

        // WHEN
        Person person = Person.builder()
                .name(expectedPersonName)
                .surname(expectedPersonSurname)
                .gender(expectedPersonGender)
                .age(expectedPersonAge)
                .addFriends(friends)
                .build();

        // THEN
        assertThat(person.getName()).isEqualTo(expectedPersonName);
        assertThat(person.getSurname()).isEqualTo(expectedPersonSurname);
        assertThat(person.getGender()).isEqualTo(expectedPersonGender);
        assertThat(person.getAge()).isEqualTo(expectedPersonAge);
        assertThat(person.getFriends()).isEqualTo(friends);

    }

    private List<Person> createFriends(int size) {
        List<Person> personLists = new ArrayList<>();
        for (int i=0; i<size; i++){
            Person person = Person.builder()
                    .name(String.valueOf("name" + i))
                    .surname(String.valueOf("surname" + i))
                    .gender(size % 2 == 0? Gender.MALE : Gender.FEMALE)
                    .age(i * 10)
                    .and()
                    .build();
            personLists.add(person);
        }
        return personLists;
    }

}
