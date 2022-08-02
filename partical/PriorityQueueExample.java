package collection;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueExample {

	public static void main(String[] args) {
            
		PriorityQueue <String> a1 = new PriorityQueue <String>();
		
		 a1.add("shiu");
		 a1.add("shiva");
		 a1.add("pallavi");
		 a1.add("mona");
		 a1.add("rani");
		 a1.add("rashi");
		 a1.add("priya");
		 a1.add("ajay"); 
		 
		 System.out.println("peek element:"+ a1.element());
		 
		 Iterator<String> itr= a1.iterator();
		 while(itr.hasNext()) {
		 System.out.println(itr.next());
		 }
		 Iterator<String> itr1= a1.iterator();
		 while(itr1.hasNext()) {
		 System.out.println(itr1.next());
		 }
		 
		 
		 
	}

}
