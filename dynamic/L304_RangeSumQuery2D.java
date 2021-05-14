package dynamic;
import java.util.*;
public class L304_RangeSumQuery2D {
	private int [][] rangesum ;
	public L304_RangeSumQuery2D(int matrix[][]) {
		
		rangesum = new int [matrix.length+1][matrix[0].length+1];
		
		for(int i = 0;i<matrix.length; i++) {
			for(int j = 0 ; j<matrix[0].length ; j++) {
				rangesum[i+1][j+1] = rangesum[i+1][j]+rangesum[i][j+1]+matrix[i][j];
			}
		}
		
		
		
	}
	
	public int sumRegion(int row1, int col1, int row2, int col2) {
		
		
		
		return rangesum[row2+1][col2+1] - rangesum[row2+1][col1]-rangesum[row1][col2+1]+rangesum[row1][col1];
	}
	
	
}
