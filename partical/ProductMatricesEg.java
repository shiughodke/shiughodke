package New;

public class ProductMatricesEg {

	public static void main(String[] args) {
    
		//creating two parameter
				int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
				int arr1[][]= {{1,2,3},{6,7,8},{9,8,9}};
				
				int r= arr.length;
				int c= arr[0].length; // calculate the number of row & col in arr
				
				int r1 =arr1.length;
				int c1=arr1[0].length; //calculate the number of row & col in arr
				
				if(c!=r1) {
					System.out.println("Multiplication not possible");
				}
				else
				{
					int res[][]= new int[r][c1]; // hold result
				//product of matrices arr & arr1 store in row
				for(int i =0; i<r; i ++) {
				for(int k=0; k<r1; k++) {
				for(int j=0;j<c1;j++) {
				
				res[i][j] = res[i][j] + arr[i][k] * arr[k][j];
				}
				
				

	             }

				}
				}
	            }
                }



	
