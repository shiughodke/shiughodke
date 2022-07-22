package New;

import java.util.*;

public class Employee {
	
		public static void main(String[] args) {
			
			Scanner s = new Scanner(System.in); // creating Scanner object
			 System.out.println("Enter salary");
			int bsalary = s.nextInt(); // reading
		    

	       float hra,da,totalsalary,gross;

		if(bsalary>500) {
			hra = 500;
			da = 90;
			totalsalary = hra * da * bsalary;
			System.out.println("total salary :"+totalsalary);
		}
		else
		{
			hra = 200;
		    da = 70;
		    totalsalary = hra * da * bsalary;
			System.out.println("total salary :"+totalsalary);
	    }
	    gross = bsalary+hra+da;
		System.out.println("gross salary:"+gross);		

	}
    }


	
	

