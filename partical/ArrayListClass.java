package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListClass {

	public static void main(String[] args) {
    ArrayList<String> a1 = new ArrayList<String>(); //create arrayList
    a1.add("shiu"); // adding object in list
    a1.add("mona");
    a1.add("raj");
    a1.add(2,"vishu"); // adding object in list with index value
    a1.add("ajay");
    a1.add("sarika");
    a1.add("sarika"); // adding duplicate object in list 
    
    System.out.println(a1); // printing list object
    System.out.println(a1.size()); // print length of list
    
    a1.add("pallavi");
    a1.add("shiva");
    
    a1.remove(0); // remove element
    System.out.println(a1.size());
    
    System.out.println("traversing using iterator");
    //Traversing list iterator
    Iterator<String> itr = a1.listIterator(); // getting the iterator
    while(itr.hasNext()) { // check if iterator has element
    System.out.println(itr.next()); // printing element
    }
    System.out.println("traversing using loop");
  //Traversing list using for loop
    for(int i = 0;i<a1.size();i++) {
    	System.out.println(a1.get(i));
    	
    }
	}
  
}
