package hello;
// example of default constructor
public class constructorExample {
	
	int id; //0
	String studentName; //null
	double fees; //0.0
	
	
// method to display values
	void display() {
		System.out.println(id+" "+ studentName +" " + fees);
	}
	public static void main(String[] args) {
//creating object & passing values
		constructorExample c = new constructorExample();
		c.display();// display valu with object
		
	}

}
