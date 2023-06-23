package javaFuncionalProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;




public class Main {
	
	static class Person {
		private final String name;
		private final String gender;
		
		public Person(String name, String gender) {
			this.name = name;
			this.gender = gender;
		}
		@Override
		public String toString() {
			return "Person [name=" + name + ", gender=" + gender + "]";
		}

	}
	

	public static void main(String[] args) {
		
			List<Person> people = Arrays.asList(
				new Person("Juan", "MALE"),
				new Person("Lucia", "FEMALE"),
				new Person("Alex", "MALE"),
				new Person("Alicia", "FEMALE"),
				new Person("Maria", "FEMALE")
					);
			
			//IMPERATIVE APPROACH
			System.out.println("## Imperative Approach ##");
			List<Person> females = new ArrayList<>();
			for(Person person : people) {
				if(person.gender=="FEMALE") {
					females.add(person);
				}
			}
			
			for (Person female : females) {
				System.out.println(female);
			}
			
			//DECLARATIVE APPROACH
			System.out.println("## Functional Approach ##");
			people.stream()
			.filter(person -> person.gender.equalsIgnoreCase("FEMALE"))
			.collect(Collectors.toList())
			.forEach(p -> System.out.println(p));
			
			
		}
		

}
