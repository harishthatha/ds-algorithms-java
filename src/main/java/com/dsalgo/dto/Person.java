package com.dsalgo.dto;

public class Person {
    private String name;
    private int id;

    public Person() {
        super();
    }
    public Person(String name, int id) {
        setName(name);
        setId(id);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
