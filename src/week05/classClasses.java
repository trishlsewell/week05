package week05;

public class classClasses {

	public static void main(String[] args) {
		// Class					//creates an Instance of a class (Object)
		StringBuilder name = new StringBuilder();
		StringBuilder name2 = new StringBuilder();
		
		Student student1 = new Student();
		student1.firstName = "Tom";
		student1.lastName = "Smith";
		student1.gradeLevel = 12;
		student1.phoneNumber = "123-456-7891";
		
		student1.introduce();
		
		Student student2 = new Student ("Sammy", "Jones");
		student2.introduce();
		
		Student student3 = new Student ("Tom", "Riddle", "012-345-6789", 11);
		student3.introduce();
		
				
		
	}

}
