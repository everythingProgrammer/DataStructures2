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
}
