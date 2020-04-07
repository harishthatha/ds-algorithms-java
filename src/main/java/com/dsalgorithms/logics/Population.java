package com.dsalgorithms.logics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Population {

    public void findHighestPopulationYear(){

    List<Person> persons = new ArrayList();
        persons.add(new Person(1900,1950));
        persons.add(new Person(1903,1955));
        persons.add(new Person(1900,1967));
        persons.add(new Person(1909,1974));
        persons.add(new Person(1900,1900));
        persons.add(new Person(1910,1974));
        persons.add(new Person(1935,1993));
        persons.add(new Person(1926,1956));
        Map<Integer,Integer> yearWisePopulation = new HashMap();

        for(Person person : persons){
            if(yearWisePopulation.containsKey(person.getBirthYear())){
                yearWisePopulation.put(person.getBirthYear(),yearWisePopulation.get(person.getBirthYear())+1);
            }else{
                yearWisePopulation.put(person.getBirthYear(),1);
            }

            if(yearWisePopulation.containsKey(person.getDeathYear())){
                int deathCount = yearWisePopulation.get(person.getDeathYear());
                if(deathCount > 0) yearWisePopulation.put(person.getBirthYear(),deathCount-1);
            }else{
                yearWisePopulation.put(person.getDeathYear(),0);
            }
        }

        System.out.println(yearWisePopulation.toString());


    }

}
