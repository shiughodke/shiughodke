package shiu;
 
public class Traniee extends Employee {
	
	
	
	
	public Traniee(long Id, String Name, String Adders, long Phone , double Salary) {
		super( Id , Name, Adders, Phone);
		this.employeeid = Id;
		this.employeeName = Name;
		this.employeeAdders = Adders;
		this.employeePhone = Phone;
		this.basicSalary = Salary;
}
}