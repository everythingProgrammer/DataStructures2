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
		while(!s.isEmpty()) {
			System.out.println(s.pop());
		}
	}
	
	
	
	
	
	public static void main(String args[]) {
		
		int arr[] = {50,30,20,40,10,45,5,60,15,8};
//		int arr[] = {1,2,3,4,3,1,2,3,4,3};
		nextGreater(arr);
		
		
	}
	
	
}
