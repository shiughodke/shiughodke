package shiu;

public class Array2DExample {

	public static void main(String[] args) {
    // declaring & initializing 2D array
		int arr[][] = {{1,2,3},{4,4,5},{8,8,8},};
		
		//printing 2D array
		for (int i=0;i<3;i++) { // fetch row
		for(int j=0;j<3;j++) { // fetch col
		System.out.print(arr[i][j]);
	}
     System.out.println();
}
}
}