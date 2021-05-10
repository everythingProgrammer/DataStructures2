package dynamic;

public class L279_PerfectSquares {

	
	 public  static int numSquares(int n) {
	        int dp[] = new int[n+1];
	        dp[0] = 0;
	        if(n == 0)
	            return 0;
	        for(int i=1; i<=n; i++){
	            int min = Integer.MAX_VALUE;
	            for(int j=1; j*j<=i; j++){
	                if(dp[i-(j*j)]<min){
	                    min = dp[i-(j*j)];
	                }
	            }
	            dp[i] = min+1;
	        }
	        return dp[n];
	    }
	public static void main(String args[]) {
		int n = 5;
		System.out.println(numSquares(7));
		
	}
}
