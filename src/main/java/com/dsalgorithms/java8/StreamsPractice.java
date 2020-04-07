package com.dsalgorithms.java8;

import com.dsalgorithms.dto.Person;
import static com.dsalgorithms.java8.SampleData.*;

public class StreamsPractice {

	public boolean isContainPerson(Person person) {
		
		NAMES.stream().forEach(personData -> {
			
			System.out.println(personData.getName());
		});

		return false;
	}

}
