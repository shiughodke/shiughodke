package hello;
import java.util.Scanner;


public class ScannerExample {

	
	static void find(int num) {
		if(num%2 ==0) {
			System.out.println("number is even");
		}
		else
			System.out.println("number is odd");
	}
	
	public static void main(String[] args) {
 Scanner sc = new Scanner(System.in); // creating scanner object
System.out.println("Enter number");
int num = sc.nextInt(); // reading
 
find (num); // method calling
	}

}
