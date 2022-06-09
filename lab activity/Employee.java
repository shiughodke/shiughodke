package shiu;

public class Employee {
// instance variable
	long employeeid ;
	String employeeName;
	String employeeAdders;
	long employeePhone ;
	double basicSalary;
	double specialAllowance = 250.80; // default value
	double hra = 1000.50; // default value


	

	// parameter constructor

	
	public Employee(long Id, String Name, String Adders, long Phone) {
		super();
		this.employeeid = Id;
		this.employeeName = Name;
		this.employeeAdders = Adders;
		this.employeePhone = Phone;
	}

// calculate basic Salary
	
	public void calculateSalary() {
		double Salary; // local variable
		Salary = basicSalary + (basicSalary * specialAllowance/100)+(basicSalary * hra/100);
		
		System.out.println("Employee Salary is : " + Salary);
	}





	
	

	}


