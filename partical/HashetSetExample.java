package collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashetSetExample {

	public static void main(String[] args) {
      HashSet<String> a1 = new HashSet<String>();
         a1.add("shiu");
		 a1.add("shiva");
		 a1.add("pallavi");
		 a1.add("mona");
		 a1.add("rani");
		 a1.add("rashi");
		 a1.add("priya");
		 a1.add("mona");// cannot take duplicate
		 a1.add(null); // allows null values
		 
		 a1.remove(3);
		 
		 Iterator<String> itr = a1.iterator();
		 while(itr.hasNext()) {
			 System.out.println(itr.next());
		 }
	}

}
