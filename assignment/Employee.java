package hello;

public class Employee {
//default method
	public void my() {
		System.out.println("Employee details are:");
	}
	//parameter method
	public void personDetails(String eName, long ePhone, String email, String addr, String education) {
		System.out.println(eName +" "+ ePhone +" "+ email +" "+ addr + "  "+ education);
	}
	
	
	public static void main(String[] args) {
		Employee emp = new Employee();
		Employee emp1 = new Employee();
		emp.my();
		
		emp.personDetails("ram", 356576899, "shiutikk@gmail.com", "pune", "BE");
		emp.personDetails("raj", 357980899, "rajnthh@gmail.com", "mumbaie", "MA");
	

		

	}

}
