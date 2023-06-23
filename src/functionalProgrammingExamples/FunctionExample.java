package functionalProgrammingExamples;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionExample {

	public static void main(String[] args) {
		int increment = increment(0);
		System.out.println(increment);
		
		//Function application
		System.out.println("### Function Application ###");
		int increment2 = incrementByOneFunction.apply(5);
		System.out.println(increment2);		
		
		int multiplyByTen = multiplyByTenFunction.apply(increment2);
		System.out.println(multiplyByTen);	
		
		//Function Chain application
		System.out.println("### Function Chain Application ###");
		Function<Integer, Integer> incrementAndThenMultiply = multiplyByTenFunction.andThen(incrementByOneFunction);
		System.out.println(incrementAndThenMultiply.apply(7));
		
		//BiFunction application
		System.out.println("### BiFunction Chain Application ###");
		System.out.println(incrementBy2AndMultiplyFunc.apply(7,20));
	}
	
	static Function<Integer,Integer> incrementByOneFunction = number -> number+1;
	static Function<Integer,Integer> multiplyByTenFunction = number -> number*10;
	static BiFunction<Integer, Integer, Integer> incrementBy2AndMultiplyFunc = 
			(number,multiplyby)->(number+2)*multiplyby;
	
	static int increment(int number) {
		return number+1;
		
	}
	
	static int incrementBy2AndMultiply(int number, int multiplyBy) {
		return (number +2)*multiplyBy;
		
	}

}
