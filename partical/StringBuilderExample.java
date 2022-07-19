package New;

public class StringBuilderExample {

	public static void main(String[] args) {
	     //String s = new String("Shiu");
			StringBuilder s = new StringBuilder(); // creating object of StringBuilder class
		 //	s.append("Aundip Foundation"); // change String s
		//	System.out.println(s); //Shiu Aundip Foundation
			
     	//  	s.insert(0, "Boga"); // inserts String at given position
			s.replace(0, 3, "Ran"); //replace String from start to end position
			System.out.println(s);	
			

	}

}
