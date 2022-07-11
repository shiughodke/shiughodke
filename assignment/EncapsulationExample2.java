package shiu;

import java.util.Scanner;

public class EncapsulationExample2 {

	public static void main(String[] args) {
		Employe1 s = new Employe1(); //object creation for accessing variables
		//s.setEmpName("rani");
		//s.setEmpPhono(67890098);
		//s.setId(191));
		
		//Scanner class to take take value from user
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter EmpName");
		String Name = sc.nextLine();
		s.setEmpName(Name);


		System.out.println("Enter Phono");
		int Phono = sc.nextInt();
		s.setEmpPhono(Phono);
		
		System.out.println("Enter Id");
		int Id = sc.nextInt();
		s.setId(Id);
		
		s.setEmpName("rani");
		s.setEmpPhono(67890098);
		s.setId(191);
		
		System.out.println("Name is :"+ s.getEmpName());
		System.out.println("Phono is :" + s.getEmpPhono());
		System.out.println("Id is :" + s.getId());
		

	}

}
