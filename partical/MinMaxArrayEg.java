package shiu;

public class MinMaxArrayEg {

	public static void main(String[] args) {
		//initialize arry
	       int [] arr  = new int [] {1,2,3,4,5,3,9,8,9};
           int min = arr[0];
           int max = arr[0];
           
           System.out.println(" -----Array---");
	        for(int i=0;i<arr.length;i++) {
	        	if(arr[i] > max); // comapre element with max
	        	max = arr[i];
	        }

	        System.out.println("Largest :" + max);
	        
	        for(int i=0;i<arr.length;i++) {
	        	if(arr[i] < min); // comapre element with min
	        	min = arr[i];
	}
	        System.out.println("Smallest :" + max);

}
}