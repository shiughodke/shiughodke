package hello;
// Employee  has a department

class department{
	 // declare variables 
	int deptId;
	String deptName;
	String deptHod;
	 
	//parameter constructor
	public department(int deptId, String deptName, String deptHod) {
		this.deptId = deptId;
		this.deptName = deptName;
		this.deptHod = deptHod;
		

		
	}	

}

class employee{
	// declare variable
	int id;
	String empname;
	String empAdders;
	department dept; // department is class, employee has entity reference dept
	
	//parameter constructor
	
	public employee(int id, String empName, String empAdders,department dept) {
		this.id = id;
		this.empname = empName;
		this.empAdders = empAdders;
		this.dept = dept;
		
		}
	// non static method to display values
	
	void display() {
		System.out.println(id+ " "+empname+" "+empAdders);// employee variable
		System.out.println(dept.deptId+ " "+ dept.deptName+" "+ dept.deptHod);// department variable

	}
	}
	public class aggerfationExamole {

	public static void main(String[] args) {
		
		department d = new department(1,"IT","shiu");
		department d1 = new department(2,"ME","jaya"); // creating object department
		
		employee e = new employee(3,"rohini","loha" ,d );
		employee e2 = new employee(4,"mona","pune",d1); // creating object employee
		
		e.display();
		e2.display(); // calling method to print values

		
 

		
		

	}

}
