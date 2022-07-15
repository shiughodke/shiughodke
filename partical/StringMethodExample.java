package New;

public class StringMethodExample {

	public static void main(String[] args) {
     String s = "mamt";
     System.out.println(s.toUpperCase()); //MAMT
     //     System.out.println(s.tolowerCase()); 
      
     System.out.println(s.startsWith("m")); // true
     System.out.println(s.endsWith("m")); // false
     
     System.out.println(s.length()); //4
     
     String rs = s.replace("shiu", "raj"); // replace all occurance in String
     System.out.println(rs);
     
     String s1 = "RjaKumar";
     String s2 = "Kumar";
     String s3 = "rajkumar";
     System.out.println(s1.equals(s2)); //false
     System.out.println(s1.equals(s3)); // false case do not match
     System.out.println(s1.equalsIgnoreCase(s3)); //true
     
     System.out.println(s1.compareTo(s2)); // positive
     System.out.println(s2.compareToIgnoreCase(s1));// negative
     
     String s4 = "raj is good boy";
     System.out.println(s1.concat("raj")); // last name attach
     
     System.out.println(s4.contains("good")); // true
     String [] arr = s4.split("\\s");
     for(String a: arr) {
     System.out.println(a);
     }
     
     System.out.println(s4.substring(3));
     System.out.println(s4.substring(0, 9));
       
     
	}

}
