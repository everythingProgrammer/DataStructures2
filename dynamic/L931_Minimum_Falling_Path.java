package dynamic;
import java.util.*;
public class L931_Minimum_Falling_Path {
	
	
	 public static int minFallingPathSum(int[][] matrix) {
		 
		 int grid[][] = new int[matrix.length ][matrix.length+2];
		 
		 for(int i = 0; i<matrix.length; i++)
		 {
			 grid[i][0] = Integer.MAX_VALUE;
			 grid[i][grid[0].length-1] = Integer.MAX_VALUE;
 		 }
		 
		 /*intialize grid*/
		 for(int i = 1 ;i<grid[0].length-1; i++) {
			 grid[0][i] = matrix[0][i-1];
		 }
		 
		 /*now run all over the grid one by one*/
		 for(int i = 1 ;i<matrix.length; i++) { 
			 for(int j = 1; j<matrix.length+1 ; j++) {
				 grid[i][j] = matrix[i][j-1] + Math.min(grid[i-1][j+1], Math.min(grid[i-1][j], grid[i-1][j-1]));
			 }
		 }
		 
//		 for(int i = 0 ; i<matrix.length; i++) {
//			 for(int j = 0; j<grid[0].length  ; j++) {
//				 System.out.print(grid[i][j]+",");
//			 }
//			 System.out.println();
//		 }
		 int min = Integer.MAX_VALUE;
		 for(int i = 1 ; i<grid[0].length-1; i++) {
			 if(grid[matrix.length-1][i] <min) {
				 min = grid[matrix.length-1][i];
			 }
		 }
		 return min;
	 }
	
	
	
	public static void main(String args[]) {
//		int nums[][] = { {2,1,3},{6,5,4},{7,8,9}};
		int nums[][] = { {-19,57},{-40,-5}};
		
		System.out.println(minFallingPathSum(nums));
	}
}
