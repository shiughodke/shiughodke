package New;

public class StringExample {

	public static void main(String[] args) {
       String s = "shiu";// create String using literal
       String s1 = "shiu";
       System.out.println(s);
       System.out.println(s1);
       
      //or
       char [] arr = {'a','d','e','u'};
       String s11 = new String(arr); // converting char array to String
       System.out.println(s11);
       
       //or
       String s3 = new String("Anudip"); // creating String using new keyword
       String s4 = new String("Anudip");
       System.out.println(s3);
       System.out.println(s4);

       
	}

}
