package stacks;
import java.util.*;
public class StockSpanner {
	  Stack<Integer> prices, weights;
	    public StockSpanner() {
	        prices = new Stack<Integer>();
	        weights = new Stack<Integer>();
	    }
	    
	    public int next(int price) {
	        int w = 1;
	        
	        while(!prices.isEmpty() && prices.peek()<= price){
	            prices.pop();
	            w+=weights.pop();
	        }
	        prices.push(price);
	        weights.push(w);
	        return w;
	    }
	    
	    
	    
	    
	    public static void spanner(int nums[]) {
	    	Stack<Integer> stack = new Stack<>();
	    	int res[] = new int[nums.length];
	    	
	    	 for(int i = 0 ;i<nums.length; i++) {
	    		res[i] = 1;
	    		while(!stack.isEmpty() && nums[stack.peek()]<=nums[i] ) {
	    			
	    			stack.pop();
	    		}
	    		if(stack.isEmpty()) {
	    			/**/
	    			res[i] = i;
	    		}
	    		else {
	    			res[i] = i-stack.peek()-1;
	    		}
	    		stack.push(i);
	    	}
	    	
	    	
	    	for(int a:res) {
	    		System.out.print (a+",");
	    	}
	    	
	    }
	    
	    public static void main(String args[]) {
	    	StockSpanner s1  = new StockSpanner();
	    	System.out.print (s1.next(80));
	    	System.out.print(s1.next(50));
	    	System.out.print (s1.next(70));
	    	System.out.print (s1.next(30));
	    	System.out.print (s1.next(20));
	    	System.out.print (s1.next(40));
	    	System.out.print (s1.next(90));
	    	int arr[]= {80,50,70,30,20,40,90};
	    	 spanner(arr);
	    }
}
