package functionalProgrammingExamples;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateExample {

	public static void main(String[] args) {
		// Standard way
		System.out.println("### Not Using Predicate ###");
		System.out.println(isPhoneNumberValid("07000"));
		System.out.println(isPhoneNumberValid("09000"));
		
		// Predicate
		System.out.println("### Predicate Use ###");
		System.out.println(isPhoneNumberValidPredicate.test("07000"));
		System.out.println(isPhoneNumberValidPredicate.test("070010"));
		
		// Predicate Chaining
		System.out.println("PhoneNumber (07002) Valid and contains number 2: " +
				isPhoneNumberValidPredicate.and(phoneNumberContainsNumber2).test("07002"));
		System.out.println("PhoneNumber (07000) Valid and contains number 2: " +
				isPhoneNumberValidPredicate.and(phoneNumberContainsNumber2).test("07000"));
		System.out.println("PhoneNumber (07000) Valid and contains number 2: " +
				isPhoneNumberValidPredicate.or(phoneNumberContainsNumber2).test("07000"));
		
		// BiPredicate Chaining
		System.out.println("### BiPredicate Use ###");
		System.out.println(isPrivacyPhoneBiPredicate.test("07002", "ES"));
		System.out.println(isPrivacyPhoneBiPredicate.test("07002", "SE"));
	}
	
	static Predicate<String> isPhoneNumberValidPredicate = 
			phoneNumber -> phoneNumber.startsWith("07") && phoneNumber.length() == 5;
			
	static Predicate<String> phoneNumberContainsNumber2 = 
			phoneNumber->phoneNumber.contains("2");
			
	static BiPredicate<String, String> isPrivacyPhoneBiPredicate = 
			(phoneNumber, countryCode) -> countryCode.equals("ES") ? isPhoneNumberValidPredicate.test(phoneNumber) : true; 
	
	static boolean isPhoneNumberValid (String phoneNumber) {
		return phoneNumber.startsWith("07") && phoneNumber.length() == 5 ;
		
	}
}
