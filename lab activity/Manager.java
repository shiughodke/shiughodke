package shiu;

public class Manager extends Employee {
	
	
	public Manager(long Id, String Name, String Adders, long Phone , double Salary) {
		super( Id , Name, Adders, Phone);
		this.employeeid = Id;
		this.employeeName = Name;
		this.employeeAdders = Adders;
		this.employeePhone = Phone;
		this.basicSalary  = Salary;

}
}