package com.dsalgorithms.logics;

public class Person {

    private int birthYear ;

    public int getBirthYear() {
        return birthYear;
    }

    public int getDeathYear() {
        return deathYear;
    }

    private int deathYear;

    public Person(int birthYear, int deathYear){
        this.birthYear = birthYear;
        this.deathYear = deathYear;
    }

}
