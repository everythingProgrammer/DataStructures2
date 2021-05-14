package dynamic;
import java.util.*;
public class L300_LIS {
	/*Can Only be done in 2 time complexities */
	/* Increasing subsequence need not be contigous*/
	
	
		/* Time Complexity O(n^2)*/
		/*On the left side , the sequence will have been decided ...*/
	  public static int lengthOfLIS(int[] nums) {
		  if(nums.length == 0) {
			  return 0;
		  }
		  int max =  1;
	        int strg[] = new int[nums.length];
	        Arrays.fill(strg, 1);
	        for(int i = 0 ; i<strg.length; i++) {
	        	for(int j = 0; j<i ; j++) {
	        		if(nums[j] <nums[i]) {
	        			strg[i] = Math.max(strg[i], strg[j]+1);
	        			max  = Math.max(max,strg[i]);
	        		}
	        	}
	        }
	        return max;
	  }
	  
	  
	  /*LISBU */
	  public static int LISBU(int arr[]) {
		  int dp[]  = new int[arr.length];
		  dp[0] = arr[0];
		  int len = 1;
		  for(int i =1 ; i<arr.length; i++) {
			  if(arr[i] > dp[len-1]) {
				  dp[len ] = arr[i];
				  len++;
			  }else {
				  // here use binary search to find just bigger element
				  int indx = binarySearch(dp, 0, len-1, arr[i]);
				  dp[indx] = arr[i];
			  }
		  }
		  
		  return len;
	  }
	  
	  public static int binarySearch(int dp[] , int si , int ei , int i) {
		  int low = si;
		  int high = ei ;
		  while(low<= high) {
			  int mid = (high+low)/2;
			  if( i>dp[mid] ) {
				 low = mid+1;
			  }else {
				  high = mid-1;
			  }
		  }
		  
		  return low;
		  
	  }
	  
	  public static void main(String args[]) {
//		  int arr[] = {10,9,2,5,3,7,101,18};
		  int arr[] = {10,9,2,5,3,7,101,18};
		  
		  
		  System.out.println(LISBU(arr));
	  }
}
