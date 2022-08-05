package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
public class StudentArrayList {

	public static void main(String[] args) {
    // create object of student
		Student s = new Student(1,"shiu",124367,12);
		Student s1 = new Student(2,"shiva",14367,18);
		Student s2 = new Student(3,"komal",884367,20);
		Student s3 = new Student(4,"vikas",155367,22);
		Student s4 = new Student(6,"ajay",1249967,24);
		Student s5 = new Student(7,"raj",1200367,28);
		Student s6 = new Student(8,"rani",100367,16);
		Student s7 = new Student(9,"shubham",120556737,19);
		Student s8 = new Student(10,"madhav",1200367,30);
		Student s9 = new Student(11,"mona",1089967,8);

		ArrayList<Student> a1 = new ArrayList<Student>(); // create arraylist of student datatype
		
		a1.add(s); // adding student object
		a1.add(s1);
		a1.add(s2);
		a1.add(s4);
		a1.add(s5);
		a1.add(s6);
		a1.add(s7);
		a1.add(s8);
		a1.add(s9);
		
	  Collections.sort(a1);// sort student a1.age
	  for(Student st : a1) {
		  System.out.println(st.stud+" "+st.sname+" "+st.sphone+" "+st.age);
	  }
	
		
			
		
	}

}
