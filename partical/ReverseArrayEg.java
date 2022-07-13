package shiu;

public class ReverseArrayEg {
	public static void main(String[] args) {

		//initialize arry
      int [] arr  = new int [] {1,2,3,4,5,3,9,8,9};
    
      System.out.println("------Array-----");
      //loop for printing array
       for(int i=0;i<arr.length;i++) {
        System.out.print(arr[i] + " ");
      
	}
       System.out.println();
       
       System.out.println("------ Reverse Array-----");
     //loop for printing array
       for(int i=arr.length-1; i>=0; i--) {
        System.out.print(arr[i] + " ");
      



	}

	}
}
