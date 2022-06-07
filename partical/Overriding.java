package shiu;
// parent class
class Reversebank{
	int getRateOfInterest() {
		return 0;
		
		
	}
}
//child class
class Icici extends Reversebank{
	int getRateOfInterest() {
		//Overriding class method
		return 7;
		
	}
}

//child class
class Axis extends Reversebank{
	int getRateOfInterest() {
		return 8;
		
	}
}
public class Overriding {

	public static void main(String[] args) {
        Icici c =new Icici(); //create object to call
        Axis a = new Axis (); // create object to call method
        System.out.println("Rate of interst for ICICI :"+ c.getRateOfInterest());
        System.out.println("Rate of interst for Axis :"+ c.getRateOfInterest());

        
 	}

}
