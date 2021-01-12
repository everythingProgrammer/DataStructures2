package heaps;

public class MaxHeapClient {
	
	public static void main(String args[]) {
		MaxHeap obj = new MaxHeap();
		
		obj.add(5);
		obj.add(13);
		obj.add(2);
		obj.add(10);
		obj.add(9);
		obj.add(8);
		obj.add(16);
		
		
		
		/*kth largest element from array */
		int k = 3;
		while(k>1) {
			obj.pop();
			k--;
		}
		System.out.println(obj.pop());
		
	}
	
	
}
