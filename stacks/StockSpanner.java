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
	    
	    
	    public static void main(String args[]) {
	    	StockSpanner s1  = new StockSpanner();
	    	System.out.print (s1.next(80));
	    	System.out.print(s1.next(50));
	    	System.out.print (s1.next(70));
	    	System.out.print (s1.next(30));
	    	System.out.print (s1.next(20));
	    	System.out.print (s1.next(40));
	    	System.out.print (s1.next(90));
	    }
}
