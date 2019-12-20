package my.learning.first;

// learning instance variable 

public class LearninInstanceVariableTypes {
	
	String address = "Grand coulee"; // instance variable
	String name = "Basu"; // instance variable
	int age = 45;
	
			
	
	// instance variable
	// 1. which declares on the class and outside of the method
	// 2.to call this variable we need to instansiate by using key word 'new'
	
	

	public static void main(String[] args) {
		LearninInstanceVariableTypes key = new LearninInstanceVariableTypes();
		System.out.println (key.address);
		System.out.println(key.name);
       System.out.println(key.age);
		
	}
	
}
