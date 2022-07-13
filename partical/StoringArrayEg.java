package shiu;

public class StoringArrayEg {

	public static void main(String[] args) {
	     // method to find duplicate value
			
			//initialize arry
	       int [] arr  = new int [] {1,2,3,4,5,3,9,8,9};
	       int temp =0;
	       //display original array
	        System.out.print("-------Array----");
	        //loop for printing array
	        for(int i=0;i<arr.length;i++) {
	        	System.out.print(arr[i] + " ");
	        	
	        }
	        //sort array in ascending
	        for(int i=0;i<arr.length;i++) {
	        	for(int j =1;j<arr.length;j++) {
	        		if(arr[i]> arr[j]) {
	        			temp = arr[i];
	        			arr[i]=arr[j];
	        			arr[j]= temp;
	        		}
	        	}
	        }
	        System.out.println();
	        System.out.println("-------ascending----");
	        for (int i =0; i<arr.length;i++) {
	        	System.out.print(arr[i] + " ");
	        
	   
	       
		}

	}

}
