package com.dsalgo.java8;

import com.dsalgo.dto.Person;

import static com.dsalgo.java8.SampleData.NAMES;

public class StreamsPractice {

    public boolean isContainPerson(Person person) {
        NAMES.stream().forEach(personData ->
                System.out.println(personData.getName())
        );
        return false;
    }

}
