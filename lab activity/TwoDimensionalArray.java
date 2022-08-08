package Lab;

public class TwoDimensionalArray {

	public static void main(String[] args) {
	    // declaring & initializing 2D array
       int  [][]arr = {{10,20,30},{40,50,60}};
       System.out.print("Original Array:\n");
       print_array(arr);
       System.out.print("After changing the row and columns");
       transpose(arr);
	}
       
       private static void transpose(int[][] arr) {
           //printing 2D array
    	   int [][] arr1 = new int [arr[0].length] [arr.length];
      
       for(int i=0; i<arr.length;i++) {
       for(int j=0; j<arr[0].length;j++) {
         arr[i][j] = arr[i][j];
       }

       }
       print_array(arr1);
       
       }
         
       
       private static void print_array(int[][]arr) {
    	   for(int i=0; i<arr.length;i++) {
    	       for(int j=0; j<arr[0].length;j++) {
    	    	   System.out.println(arr[i][j]+" ");
    	       }
    	   System.out.println();
       
       }
}
}
