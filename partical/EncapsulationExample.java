package shiu;

import java.util.Scanner;

public class EncapsulationExample {

	public static void main(String[] args) {
		Student obj = new Student(); // object creation for accessing variables
		//obj.setId(101); //putting values using set()
		//obj.setsName("shiu");
		//obj.setsEmail("shiushakti@gmail.com");
		//obj.setsPhone(12346780);
		   
		//Scanner class to take take value from user
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id");
		int id = sc.nextInt();
		obj.setId(id);
		
		System.out.println("Enter Name");
		String n = sc.nextLine();
		obj.setsName(n);
		
		System.out.println("Enter phone");
		long ph = sc.nextLong();
		obj.setsPhone(ph);
		
		System.out.println("Enter Email");
		String e = sc.next();
		obj.setsEmail(e);

	
		obj.setId(101);
		obj.setsName("shiu");
		obj.setsEmail("shiushakti@gmail.com");
		obj.setsPhone(12346780);
		
		System.out.println("--------Student Details--------");
		System.out.println("Id is :" + obj.getId()); // fetch value using get() 
		System.out.println("Name is :" + obj.getsName());
		System.out.println("Email is :" + obj.getsEmail());
		System.out.println("Phone is :" + obj.getsPhone());



		

	
		


	}

}
