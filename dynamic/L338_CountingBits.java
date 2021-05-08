package dynamic;
import java.util.*;
public class L338_CountingBits {
	
	public static int[] countBits(int num) {
		int dp[] = new int[num+1];
		
		dp[0] = 0;
		if(num == 0) {
			return dp;
		}
		dp[1] = 1;
		if(num == 1) {
			return dp;
		}
		for(int i = 2 ; i<num+1; i++) {
			dp[i] = (int)(i%2)==0?dp[i/2]:dp[i-1]+1;
		}
		return dp;	
	}
	
	public static void main(String args[]) {
		int arr[] = countBits(5);
		for(int ar: arr) {
			System.out.println(ar);
		}
	}
}
