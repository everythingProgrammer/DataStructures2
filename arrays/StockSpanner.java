package arrays;
import java.util.*;
public class StockSpanner {
	
	
	public static void main(String args[]) {
		
		int stocks [] = {80,50,70,30,20,40,90 };
		int res[] = new int [stocks.length];
		res[0] = 1;
		for(int i = 1; i< stocks.length; i++) {
			res[i] = 1;
			for(int j = i-1; j>=0; j--) {
				if(stocks[j]<=stocks[i]) {
					res[i] = res[i]+1;
				}
			}
		}
		for(int a:res) {
			System.out.print(a+" ");
		}
	}
	
}
