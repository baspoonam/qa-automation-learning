package my.learning.first;

public class LearningLocalVariablesTypes {

	
	String password = "123Hello" ;
	String userName = "baspoonam@gmail.com";
	int ssn = 123456789;
			
	
	
// local variable is declared on the method
// it will have scope only inside the method
	// it will born and die inside the method
	// you can not call outside
	
	
	// main method
	// there will be only one main method in class
	// it will help to execute the class
	public static void main(String[] args) {
		
		int salary = 8000;
		String bank = "USAA";
		//System.out.println(salary);
		//System.out.println(bank);
		LogIn();
		LogOut();
		Multiply(5, 6);
		Add(10,10);
		Subtract(50,5);
	}
	
	public static void LogIn(){
		LearningLocalVariablesTypes Basu = new LearningLocalVariablesTypes();
		
		System.out.println(Basu.userName);
				
	}
	
	
	public static void LogOut(){
		LearningLocalVariablesTypes Poonam = new LearningLocalVariablesTypes ();
		
		
			System.out.println(Poonam.ssn );

}
	
	public static void Multiply(int a,int b){
		System.out.println(a * b);
	}
	
	public static void Add (int c, int d){
		System.out.println("this is from add method : " + ( c + d)); 
	} 
	
	public static void Subtract (int x, int y){
		System.out.println("this is from Subtract : " +  ( x - y));
	}
	
	
	// instance variable
	// local variable
	
	
	
}
