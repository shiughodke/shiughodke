package hello;

public class constructorExample1 {
 int id;   
 String Name;
 double fees;
  //cretaing parameterized constructor
 
 public constructorExample1(int id, String Name ,double fees ) {
	 this.id = id;
	 this . Name = Name ;
	 this .fees = fees;
	 
 }
   // method to display the values
 
 void display() {
	 System.out.println(id+ " "+ Name +" "+fees);
 }
 
	public static void main(String[] args) {
// creating object & passing values
		constructorExample1 c = new constructorExample1(101, "ram", 678.2);
		 c.display();// display valu with object
		
	}

}
