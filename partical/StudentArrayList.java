package collection;

import java.util.ArrayList;
import java.util.Iterator;
public class StudentArrayList {

	public static void main(String[] args) {
    // create object of student
		Student s = new Student(1,"shiu",124367);
		Student s1 = new Student(2,"shiva",14367);
		Student s2 = new Student(3,"komal",884367);
		Student s3 = new Student(4,"vikas",155367);
		Student s4 = new Student(6,"ajay",1249967);
		Student s5 = new Student(7,"raj",1200367);
		
		ArrayList<Student> a1 = new ArrayList<Student>();
		
		a1.add(s);
		a1.add(s1);
		a1.add(s2);
		a1.add(s4);
		a1.add(s4);
		a1.add(s5);
		
		System.out.println("____student List______");
		 //Traversing list iterator
		Iterator<Student> itr = a1.iterator(); // get iterator
		while(itr.hasNext()) {
			Student st = itr.next(); // printing list unit next element
			System.out.println(st.stud+" "+st.sphone+" "+st.sname);
		}
		a1.remove(4); // remove element list
		System.out.println("____student list from____");
		 //Traversing list iterator
	    Iterator<Student> itr1 = a1.listIterator(); // getting the iterator
	    while(itr1.hasNext()) { // check if iterator has element
	    Student st =(itr1.next()); // printing element
		System.out.println(st.stud+" "+st.sphone+" "+st.sname);

	    }
		
		
	}

}
