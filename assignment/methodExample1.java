package hello;

public class methodExample1 {

	//parameter method
	static double add (double num1, double num2) {
		double sum = num1 + num2;
		return sum; //returning sum
		
	}
	
	static void show () {
	 System.out.println(" I am defacult static method");
	 
	}
	
	
	
	
	public static void main(String[] args) {
double n1 = 60.88;
double n2 =  76.23;
double result = add(n1, n2);
 System.out.println("Addition is : " + result);
 
 show (); // calling static method
	}

}
