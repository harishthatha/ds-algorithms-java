package com.dsalgo.java8;

import com.dsalgo.dto.Person;

import java.util.ArrayList;
import java.util.List;


public class SampleData {

    public static final List<Person> NAMES = new ArrayList<>();

    static {
        intializeData();
    }

    public SampleData() {
        intializeData();
    }

    private static void intializeData() {
        NAMES.add(new Person("harish", 1));
        NAMES.add(new Person("Mahesh", 2));
        NAMES.add(new Person("Ravi", 3));
        NAMES.add(new Person("Sunitha", 4));
        NAMES.add(new Person("Alan walker", 5));
        NAMES.add(new Person("Salena Gomez", 6));
    }

}
