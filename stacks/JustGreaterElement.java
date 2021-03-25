package stacks;
import java.util.Stack;

public class JustGreaterElement {
	
	
	public static void nextGreater(int arr[]) {
		Stack<Integer> s = new Stack<>();
		s.push(arr[0]);
		for(int i = 1; i<arr.length; i++) {
			int val = arr[i];
			if(!s.isEmpty()) {
				int ele = s.pop();
				while(ele<val) {
					System.out.println(ele+" -> "+val);
					if(s.isEmpty()) {
						break;
					}
					ele = s.pop();
				}
				if(ele>val) {
					s.push(ele);
				}
			}
			s.push(val);
		}
	}
	
	
	
	public static void main(String args[]) {
		
		
		
		
	}
	
	
}
