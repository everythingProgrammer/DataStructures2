package stacks;
import java.util.*;
public class CelibrityProblem {
	
	public static void celebrityProblem(int arr[][]) {
		
		Stack<Integer> stack = new Stack<>();
		
		for(int i = 0 ;i<arr.length; i++) {
			stack.push(i);
		}
		
		while(stack.size() >= 2) {
			int a = stack.pop();
			int b = stack.pop();
			if(arr[a][b] == 1) {
				stack .push(b);
			}else {
				stack.push(a);
			}
		}
		int res = stack.pop();
		// now check res row and coloumn
		
		for(int i = 0; i<arr.length ; i++) {
			if(arr[res][i] == 1) {
				System.out.println("No Celeb");
				return;
			}
		}
		for(int i = 0  ; i<arr.length;i++) {
			if(arr[i][res] == 1) {
				System.out.println("No Celeb");
				return;
			}
		}
	}
	
	
	
	
	
	public static void main(String args[]) {
		
	}
}
