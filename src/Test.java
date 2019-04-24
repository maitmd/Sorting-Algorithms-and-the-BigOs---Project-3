
public class Test {

	public static void main(String[] args) {
		int[] data = {1, 6, 14, 12, 10, 9};
		Node head = new Node(1, null);
		final int TOP = 12000000;
		
		System.out.println("Array Sorted");
		Sorting.insertionSort(data);
		for(int temp : data){
			System.out.println(temp);
		}
		
		
		head.addNodeAfter(12);
		head.addNodeAfter(6);
		head.addNodeAfter(14);
		head.addNodeAfter(9);
		head.addNodeAfter(10);

		head = Sorting.insertionSort(head);
		System.out.println("Node Sorted");
		head.displayData();
	}
}
