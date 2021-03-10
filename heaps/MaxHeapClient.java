package heaps;

public class MaxHeapClient {
	
	public static void main(String args[]) {
		MaxHeap obj1 = new MaxHeap();
		
		obj1.add(5);
		obj1.add(13);
		obj1.add(2);
		obj1.add(10);
		obj1.add(9);
		obj1.add(8);
		obj1.add(16);
		
		
		
		/*kth largest element from array */
		
		/*but this is using time complexity O(nlogn) and space complexity of O(n) */
		int k1 = 3;
		while(k1>1) {
			obj1.pop();
			k1--;
		}
		System.out.println(obj1.pop());
		
		/*to decrease space complexity make a min heap of 'k'    elements  and this also decreases time complexity to N Logk*/
		
		/*coding the ans */
		Heap obj = new Heap();
		int k = 3;
		int arr[] = {5,13,2,10,9,8,16};
//		add first k elements 
		obj.add(5);
		obj.add(13);
		obj.add(2);
		obj.display();
		for(int i = k ; i<arr.length; i++) {
			int min = obj.top();
			if(arr[i] > min) {
				System.out.println("Popping "+obj.pop());
				System.out.println("adding "+ arr[i]);
				obj.add(arr[i]);
				obj.display();
			}
		}
		System.out.println("kth largest element");
		System.out.println(obj.pop());
		
	
	}
	
	
}
