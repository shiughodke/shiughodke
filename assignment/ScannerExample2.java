package hello;
import java.util.Scanner;

public class ScannerExample2 {
  
  
	public static void main(String[] args) {
		
		Scanner myObj = new Scanner(System.in);
		System.out.println(" Enter username");

	
		
		
		String username = myObj.nextLine();
		System.out.println("Username is: " + username);

	}

}
