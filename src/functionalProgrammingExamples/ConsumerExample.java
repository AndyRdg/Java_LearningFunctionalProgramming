package functionalProgrammingExamples;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerExample {

	public static void main(String[] args) {
		Customer Maria = new Customer ("Maria", "123456");
		// Normal Java by Method
		System.out.println("### Normal Java by Method ###");
		greetCustomer(Maria);
		// Consumer Functional Interface
		System.out.println("### Consumer Functional Interface ###");
		greetCustomerConsumer.accept(Maria);
		// BiConsumer Functional Interface
		System.out.println("### BiConsumer Functional Interface ###");
		greetCustomerConsV2.accept(Maria, Boolean.TRUE);
		greetCustomerConsV2.accept(Maria, Boolean.FALSE);
		
	}
	


	static Consumer<Customer> greetCustomerConsumer = 
			customer -> System.out.println("Hello " + customer.customerName 
			+ ". Your phoneNumber is: " + customer.customerPhone);
			
	static BiConsumer<Customer, Boolean> greetCustomerConsV2 = 
			(customer, privacy)->
					System.out.println("Hello " + customer.customerName 
					+ ". Your phoneNumber is: " + (privacy ? customer.customerPhone : "*******")) ;
			
	static BiConsumer<String, String> sayByeCustomer = 
			(name, phone) -> System.out.println("Bye Bye " + name
					+ ". call you at: " + phone);
	
	static class Customer{
		private String customerName;
		private String customerPhone;
		
		public Customer(String customerName, String customerPhone) {
			super();
			this.customerName = customerName;
			this.customerPhone = customerPhone;
		}
		
	}
 // Imperative approach
	static void greetCustomer(Customer customer) {
		System.out.println("Hello " + customer.customerName 
				+ ". Your phoneNumber is: " + customer.customerPhone);
	}
}
