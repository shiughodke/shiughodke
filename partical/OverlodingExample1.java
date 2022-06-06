package shiu;
 class Calculator1{
	 
	 //ststic method
	 static int calculate1(int num1, int num2) { // same name but different datatype
		 return num1 * num2;
		 
	 }
	 
	 // static method
	 
	 static double calculate1(double num1,double num2) {
		 return num1 * num2;
	 }
 }
public class OverlodingExample1 {

	public static void main(String[] args) {
		System.out.println(Calculator1.calculate1(77, 88));
		System.out.println(Calculator1.calculate1(77.8, 88.9));

		

	}

}
