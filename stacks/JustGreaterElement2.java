package stacks;
import java.util.*;

//https://leetcode.com/problems/next-greater-element-ii/solution/
public class JustGreaterElement2 {
	
	// this is with time complexity O(n^2)
	
	public int[] nextGreaterElements(int nums[]) {
		int res[] = new int[nums.length];
		int [] doublenums = new int[nums.length *2];
		System.arraycopy(res, 0, doublenums, 0, nums.length);
		System.arraycopy(res, 0, doublenums, res.length, res.length);
		for(int i = 0 ; i<nums.length; i++) {
			res[i]  = -1;
			for(int j = i+1; j<doublenums.length ; j++) {
				if(doublenums[j] > doublenums[i]) {
					res[i] = doublenums[j];
					break;
				}
			}
		}
		return res;
		
		
		
	}
	
	
	
	public int[] nextGreaterElemnts2(int nums[]) {
		int res[] = new int [nums.length];
		
		for(int i = 0 ; i<nums.length; i++) { // first loop to lock on the int
			res[i] = -1;
			for(int j = 1 ; j<nums.length; j++) { // second loop to get desired integers
				if(nums[(i+j)%nums.length]>nums[i]) {
					res[i] = nums[(i+j)%nums.length];
					break;
				}
			}
		}
		return res;
	}
	
	
	public static void main(String args[]) {
		
	}
	
	
}
