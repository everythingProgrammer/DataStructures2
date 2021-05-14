package dynamic;
import java.util.*;
public class L343_IntegerBreak {
	
    private static int[] memo;
    public static int integerBreak(int n) {
        memo = new int[n + 1];
        return helper(n);
    }
    
    public static int helper(int n) {
        if (n == 1) {
            return 1;
        }
        if (memo[n] != 0) {
            return memo[n];
        }
        int maxProduct = 0;
        for (int i = 1; i <= n / 2; i++) {
            maxProduct = Math.max(maxProduct, i * Math.max(helper(n - i), n - i));
        }
        memo[n] = maxProduct;
        return maxProduct;
    }
	public static void main(String args[]) {
		integerBreak(4);
	}
	
}
