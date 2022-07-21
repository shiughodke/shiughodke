package New;

public class ExceptionExample1 {
	public void calculateperUnit() {
		int qty =0, rate = 1000, punit=0;
		punit = rate/qty; // may exception arise
		System.out.println("per unit price is :"+punit);

	}

	public static void main(String[] args) {
		ExceptionExample obj = new  ExceptionExample();
	    obj.calculateperUnit();


	}

}
