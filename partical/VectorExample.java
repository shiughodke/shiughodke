package collection;

import java.util.Iterator;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
     Vector <String> a1 = new  Vector <String>();
     a1.add("shiu");
	 a1.add("shiva");
	 a1.add("pallavi");
	 a1.add("mona");
	 a1.add(1,"rani");
	 a1.add("rashi");
	 a1.add("priya");
	 a1.add("ajay"); //get add at specific list
	 
	 //Traversing list iterator
	 Iterator<String> itr = a1.listIterator(); // getting the iterator
	    while(itr.hasNext()) { // check if iterator has element
	    System.out.println(itr.next()); // printing element
	    }
     a1.remove(3); // remove element at specific index
     
     System.out.println(a1);
     a1.add("aanu");
     a1.add("pooja");
     
     System.out.println(a1.size());
     System.out.println(a1);
     

	}

}
