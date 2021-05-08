package dynamic;
import java.util.*;
public class L303_RangeSumQuery {
	private static int sum[];
	
	public static void NumArray(int nums[]) {
		sum = new int [nums.length+1];
		for(int i = 0 ;i<nums.length; i++) {
			sum[i+1] = sum[i]+nums[i];
		}
	}
	
	
	public static int sumRange(int left, int right) {
        return sum[right+1]-sum[left];
    }
	
	public static void main(String args[]) {
		int nums[] = {-2, 0, 3, -5, 2, -1};
		NumArray(nums);
		System.out.println(sumRange(2,5));
	}
	
}
