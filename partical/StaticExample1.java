package hello;

public class StaticExample1 {
 // instance variable
	int num = 101;
	
	// creating static method
	
	static void display() {
		String name="rima";
		System.out.println("name is :" +name);
		
	}
	public static void main(String[] args) {
//creating object
		 StaticExample1 s = new StaticExample1();
		 
		 System.out.println("num is :"+ s.num);  // calling variable to display values
		 
		 StaticExample1.display();
	}

}
