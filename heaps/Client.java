package heaps;

public class Client {
	
	
	
	public static void main(String args[]) {
		Heap heap  = new Heap();
		heap.add(10);
		heap.display();
		heap.add(20);
		heap.display();
		heap.add(40);
		heap.display();
		heap.add(50);
		heap.display();
		heap.add(60);
		heap.display();
		heap.add(70);
		heap.display();
		heap.add(80);
		heap.display();
		heap.add(5);
		heap.display();
		System.out.println(heap.pop());
		heap.display();

		System.out.println(heap.pop());
		heap.display();
		System.out.println(heap.pop());
		heap.display();
		System.out.println(heap.pop());

//		heap.display();
		
	}
}
