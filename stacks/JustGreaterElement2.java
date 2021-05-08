package stacks;

import java.util.*;

//https://leetcode.com/problems/next-greater-element-ii/solution/
public class JustGreaterElement2 {

	// this is with time complexity O(n^2)

	public int[] nextGreaterElements(int nums[]) {
		int res[] = new int[nums.length];
		int[] doublenums = new int[nums.length * 2];
		System.arraycopy(res, 0, doublenums, 0, nums.length);
		System.arraycopy(res, 0, doublenums, res.length, res.length);
		for (int i = 0; i < nums.length; i++) {
			res[i] = -1;
			for (int j = i + 1; j < doublenums.length; j++) {
				if (doublenums[j] > doublenums[i]) {
					res[i] = doublenums[j];
					break;
				}
			}
		}
		return res;

	}

	public int[] nextGreaterElemnts2(int nums[]) {
		int res[] = new int[nums.length];

		for (int i = 0; i < nums.length; i++) { // first loop to lock on the int
			res[i] = -1;
			for (int j = 1; j < nums.length; j++) { // second loop to get desired integers
				if (nums[(i + j) % nums.length] > nums[i]) {
					res[i] = nums[(i + j) % nums.length];
					break;
				}
			}
		}
		return res;
	}

	public static void nextGreaterElements3(int nums[]) {
		int res[] = new int[nums.length];
		Stack<Integer> stack = new Stack<>();
		for (int i = 2 * nums.length - 1; i >= 0; i--) {

			while (!stack.isEmpty() && nums[stack.peek()] <= nums[i % nums.length]) {
				stack.pop();
			}
			res[i % nums.length] = stack.isEmpty() ? -1 : nums[stack.peek()];
			stack.push(i % nums.length);
		}
		for (int a : res) {
			System.out.print(a + " ");
		}
	}

	// simple straight loop program with stacks
	/*
	 * simply push indexes instead of running backward loops but this does't work
	 * for cirucular array edit: made the loop run twice better than previous
	 * approach
	 */
	public static void nextGreaterElements4(int nums[]) {
		Stack<Integer> stack = new Stack<>();
		int res[] = new int[nums.length];
		for (int i = 0; i < res.length; i++) {
			res[i] = -1;
		}
		stack.push(0);
		for (int i = 0; i < nums.length * 2 - 1; i++) {
			int num = nums[i % nums.length];
			while (!stack.isEmpty() && nums[i % nums.length] > nums[stack.peek()]) {
				res[stack.pop()] = nums[i % nums.length];
			}
			stack.push(i % nums.length);
		}
		for (int n : res) {
			System.out.print(n + " ");
		}

	}

	public static void main(String args[]) {
//		int nums[] = {8,1,8,4,1,2};
		int nums[] = { 50, 30, 20, 40, 10, 45, 5, 60, 8, 15 };
		nextGreaterElements3(nums);
		System.out.println();
		nextGreaterElements4(nums);
	}

}
