package collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListClass {

	public static void main(String[] args) {
      
		LinkedList <String> a1 = new LinkedList <String>();
		 a1.add("shiu");
		 a1.add("shiva");
		 a1.add("pallavi");
		 a1.add("mona");
		 a1.add("rani");
		 a1.add("rashi");
		 a1.add("priya");
		 a1.add(1,"ajay"); //get add at specific list
		 a1.addFirst("shivlila"); //beginning list
		 a1.addLast("madhavi"); // end list
		 
		 //Traversing list iterator
		 Iterator<String> itr = a1.listIterator(); // getting the iterator
		    while(itr.hasNext()) { // check if iterator has element
		    System.out.println(itr.next()); // printing element
		    }
         a1.remove(3); // remove element at specific index
         
         ListIterator<String> itr1 = a1.listIterator(); 
         System.out.println("Backward Direction");
		    while(itr1.hasNext()) { 
		    System.out.println(itr1.next()); 
		    }
		    
		    System.out.println("Forward Direction");
		    while(itr1.hasPrevious()) {
		    	System.out.println(itr1.previous());
		    }
	}

}
