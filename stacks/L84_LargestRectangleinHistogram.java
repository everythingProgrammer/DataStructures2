package stacks;
import java.util.*;
public class L84_LargestRectangleinHistogram {
	
	/*a simple O(n^2) approach would be to simply use loops*/
	
	
	/*This approach is using stacks 
	 * Here we use stacks very elegantly ... */
	/*another approach would be 
	 * https://medium.com/algorithms-digest/largest-rectangle-in-histogram-234004ecd15a*/
	 public static long largestRectangleArea(int[] heights) {
		 Stack<Integer> stack = new Stack<>(); 
		 int n = heights.length;
		 int i = 0;
		 long max_area = Integer.MIN_VALUE;
		 long curr_area = 0;
		 while(i<n) {
			 if(  stack.isEmpty() || heights[stack.peek()]<= heights[i]) {
				 stack.push(i++);
			 }
			 else {
				int topindex = stack.pop();
				curr_area = heights[topindex] * (stack.isEmpty()?i:i-stack.peek()-1);
				if(curr_area > max_area) {
					max_area = curr_area;
				}
				 
			 }
		 }
		 while(!stack.isEmpty()  ) {
			 int topindex = stack.pop();
			 curr_area = heights[topindex] * (stack.isEmpty()?i:i-stack.peek()-1);
			 if(curr_area > max_area) {
				 max_area = curr_area;
			 }
		 }
		 return max_area;
	 }
	 public static void main(String args[]) {
		 int arr[] = { 1 ,2, 3, 4, 5};
		 System.out.println( largestRectangleArea(arr) );
	 }
	 
}
