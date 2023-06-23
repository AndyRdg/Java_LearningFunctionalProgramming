package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;



public class StreamsExample {
	
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
				new Person("Anya", "NOT DEFINED"),
				new Person("Maria", "FEMALE")
					);
	 
	 people.stream()
	 .map(person -> person.name)
	 .mapToInt(name-> name.length())
	 .forEach(gender -> System.out.println(gender));
 }
}
