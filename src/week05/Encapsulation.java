package week05;

public class Encapsulation {

	public static void main(String[] args) {
	
		/*
		 * Access Modifiers:
		 * public - accessible anywhere
		 * protected - only accessible within the class, other classes within the same package
		 * and all other subclasses
		 * private - only accessible within the class itself. 
		 * o-Modifier - same as protected only it is not accessible in subclasses in a different package
		 */

		Student student = new Student();
		student.setFirstName("S"); 
		student.setLastName("Smith");
		student.setPhoneNumber("2116521345");
		student.introduce();
		
		
		
		
	}

}
