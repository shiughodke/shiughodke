package shiu;

public class DuplicateArrayEg {
     // method to find duplicate value
	public static void  CalculateDuplicate() {
		
		//initialize arry
       int [] arr  = new int [] {1,2,3,4,5,3,9,8,9};
        System.out.println("Duplicate value");
        
        for(int i=0;i<arr.length;i++) {
        for(int j= i+1;j<arr.length;j++) {
         if(arr[i]== arr[j]);
         
         System.out.println(arr[j]);
       
	}

}
}
	public static void main(String[] args) {

	     CalculateDuplicate(); // invoke method
}
}