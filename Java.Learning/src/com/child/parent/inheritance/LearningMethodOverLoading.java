package com.child.parent.inheritance;

public class LearningMethodOverLoading extends MyParentClassForTestNGLearningForMethodOverloading {

	public static void main(String[] args) {
		multiply(2, 4);
		add(5, 5);
		add(5, 5, 5);
		

	}

	//method overwriting for multiply method since this is also declares on parent class
	// here we are changing behaviour of multiply method on child class
	
	public static void multiply(int a , int b){
		System.out.println(a +  b );
	}
	
	
	
	// Method overloading 
	
	
	public static void add(int a , int b ){
		System.out.println(a + b);
	}
	
	
	// here we have same method name add, though its taking three values . which is overloading
	public static void add(int a , int b , int c){
		System.out.println(a + b + c);
	}
	
}
