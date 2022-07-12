package shiu;

public class ArrayExample1 {
	
	//creating a method which is taking array as parameter
	public void display(int arr[]) {
		for(int i=0; i<arr.length;i++) {
			System.out.println(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		ArrayExample1 a = new ArrayExample1(); // object creation for invoking method
		int arr[] = {1,2,3,4,5,2,6}; // declaring & initializing an arry
		a.display(arr);// passing array to method

	}

}
