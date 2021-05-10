package dynamic;
import java.util.*;
public class L221_MaximalSquare {
	
    public static int maximalSquare(char[][] matrix) {
        
    	int [][]dp = new int[matrix.length][matrix[0].length];
    	    	
    	for(int i = 0 ; i<dp.length; i++) {
    		for(int j = 0; j<dp[0].length; j++) {
    			dp[i][j] = 0;
    		}
    	}
    	
    	for(int i = 0 ; i<matrix.length; i++) {
    		dp[0][i] = Character.getNumericValue(matrix[0][i]);
    	}
    	

    	for(int i = 0 ; i<matrix.length; i++) {
    		dp[i][0] =  Character.getNumericValue(matrix[i][0]) ;
    	}
    	
    	
    	for(int i = 1 ; i<dp.length; i++) {
    		for(int j = 1; j<dp[0].length; j++) {
    			if(matrix[i][j] == '1'&& matrix[i-1][j] == '1' &&  matrix[i][j-1] =='1' && matrix[i-1][j-1]=='1') {
    				dp[i][j] = Math.min(Math.min( dp[i][j-1] , dp[i-1][j] ),dp[i-1][j-1] )+1;
    			}
    		}
    	}
    	
    	for(int i = 0  ; i < dp.length ; i++) {
    		for(int j = 0;j < dp[0].length; j++) {
    			System.out.print(dp[i][j] +" ");
    		}
    		System.out.println();
    	}
    	return 0;
    	
    }
    
    public static int maximalSquare1(char [][] matrix) {
    	 int rows = matrix.length, cols = rows > 0 ? matrix[0].length : 0;
         int[][] dp = new int[rows + 1][cols + 1];
         int maxsqlen = 0;
         for (int i = 1; i <= rows; i++) {
             for (int j = 1; j <= cols; j++) {
                 if (matrix[i-1][j-1] == '1'){
                     dp[i][j] = Math.min(Math.min(dp[i][j - 1], dp[i - 1][j]), dp[i - 1][j - 1]) + 1;
                     maxsqlen = Math.max(maxsqlen, dp[i][j]);
                 }
             }
         }
         return maxsqlen * maxsqlen;
    }
    
    public static int maximalSquare3(char[][] matrix) {
        int rows = matrix.length, cols = rows > 0 ? matrix[0].length : 0;
        int[] dp = new int[cols + 1];
        int maxsqlen = 0, prev = 0;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                int temp = dp[j];
                if (matrix[i - 1][j - 1] == '1') {
                    dp[j] = Math.min(Math.min(dp[j - 1], prev), dp[j]) + 1;
                    maxsqlen = Math.max(maxsqlen, dp[j]);
                } else {
                    dp[j] = 0;
                }
                prev = temp;
            }
        }
        return maxsqlen * maxsqlen;
    }
    
    /*How ever using 1D array we can reduce space complexity */
	
	public static void main(String args[]) {
//		char arr[][] = { {'1','0','1','0','0'},{'1','0','1','1','1'},
//				{'1','1','1','1','1'},{ '1','0','0','1','0'}};
		char arr[][] =  {{'0','1','1'},{'0','1','1'},{'1','1','1'}};
		maximalSquare3(arr);
	}
	
}
