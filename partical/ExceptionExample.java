package New;

public class ExceptionExample {
	public void calculateperUnit() {
		int qty = 0, rate = 1000, punit=0;
		try{
	    punit = rate/qty;	
		}
		catch(Exception e) {
		System.out.println("product quantity cannot br zero...");
		System.out.println(e);
		}
		System.out.println("per unit price is :"+punit);
	}

	public static void main(String[] args) {
    ExceptionExample obj = new  ExceptionExample();
    obj.calculateperUnit();
	}

}
