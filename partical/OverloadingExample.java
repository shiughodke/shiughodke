package shiu;
import java.util.Scanner;

class Calculator{
	
	// static method with two argument
	static int Calculate(int num1,int num2) {
		return num1 * num2;
		
		
	}
	// static method with three argument
	static int Calculate(int num1,int num2, int num3) {
		return num1 * num2 * num3;
	}
}

public class OverloadingExample {

	public static void main(String[] args) {
		// user inputs num1
		Scanner s =  new Scanner (System.in);
		System.out.println("Enter num1 :");
		int num1 = s.nextInt();

		System.out.println("Enter num2 :");
		int num2 = s.nextInt();
		
		System.out.println("Enter num3 :");
				int num3 = s.nextInt();
				
				System.out.println("Multification of two number are :"+ Calculator.Calculate(num1,num2));
				System.out.println("Multification of three number are :"+Calculator.Calculate(num1, num2,num3));
				
	}

}
