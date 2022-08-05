package collection;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorSortingExample {

	public static void main(String[] args) {
     ArrayList<Employee> a1 = new  ArrayList<Employee>();
     
     a1.add(new Employee(1,"raj",2648933,101));
     a1.add(new Employee(2,"mona",26668933,102));
     a1.add(new Employee(3,"shubh",2628649,103));
     a1.add(new Employee(4,"vishu",2612453,106));
     a1.add(new Employee(5,"komal",2648933,108));
     a1.add(new Employee(6,"ajay",27483933,109));
     
     System.out.println("by Name");
     Collections.sort(a1,new EmpNameCompare ());
     for(Employee e : a1) {
    	 System.out.println(e.empId+" "+e.empName+" "+e.empPhone+" "+e.deptId);
     }
     System.out.println("by DeptId");
     Collections.sort(a1,new DeptId());
     for(Employee e : a1) {
    	 System.out.println(e.empId+" "+e.empName+" "+e.empPhone+" "+e.deptId);
     }
	}

}
