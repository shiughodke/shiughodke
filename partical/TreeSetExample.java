package collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
     TreeSet<String> a1 = new TreeSet<String>();
     a1.add("ajay");
	 a1.add("shiva");
	 a1.add("pallavi");
	 a1.add("mona");
	 a1.add("rani");
	 a1.add("rashi");
	 a1.add("mona");// cannot take duplicate
	 a1.add(null); // not allows null values
	 
	 Iterator<String> itr = a1.iterator();
	 while(itr.hasNext()) {
		 System.out.println(itr.next());
	 }

	}

}
