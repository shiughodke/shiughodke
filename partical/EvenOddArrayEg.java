package shiu;

public class EvenOddArrayEg {

	public static void main(String[] args) {
		//initialize arry
	       int [] arr  = new int [] {1,2,3,4,5,3,9,8,9};
	       
	       System.out.println(" ------Even Array-----");
	       //i=1, first even position present at position 1
	        for(int i=1; i<arr.length; i=i+2) {
             System.out.print(arr[i] + " "); 
	        }
	        System.out.println();
	        
	        System.out.println("------Odd Array----");
	        for(int i=0; i<arr.length; i=i+2) {
	             System.out.print(arr[i] + " "); 
	       

	}
	        System.out.println();
	        //calculate even number in array
	        System.out.println("Even Number");
	        for(int i=1; i<arr.length; i=i+2) {
	        	if(arr[i]%2==0);
	        	System.out.println(arr[i] + " ");
	        }
	        System.out.println();
	        //calculate even number in array
	        System.out.println("odd Number");
	        for(int i=1; i<arr.length; i=i+2) {
	        	if(arr[i]%2!=0);
	        	System.out.println(arr[i] + " ");
	        }


	        

}
}