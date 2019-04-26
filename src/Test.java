
public class Test {

	public static void main(String[] args) {
		int[] data = {1, 6, 14, 12, 10, 9};
		Node head = new Node(1, null);
		final int TOP = 12000000;
		
		//System.out.println("Insertion Sort: Array");
		//Sorting.insertionSort(data);
		for(int temp : data){
		//	System.out.println(temp);
		}
		
		
		head.addNodeAfter(12);
		head.addNodeAfter(6);
		head.addNodeAfter(14);
		head.addNodeAfter(9);
		head.addNodeAfter(10);

		//head = Sorting.insertionSort(head);
		//System.out.println("Insertion Sort: Node");
		//head.displayData();
		
		int[] data2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		Sorting.mergeSort(data2, 0, data2.length);
		System.out.println("Merge Sort: Array");
		for(int temp : data2){
			System.out.println(temp);
		}
		
		head = new Node(1, null);
		head.addNodeAfter(12);
		head.addNodeAfter(6);
		head.addNodeAfter(14);
		head.addNodeAfter(9);
		head.addNodeAfter(10);
		
		//head = Sorting.mergeSort(head);
		//System.out.println("Merge Sort: Node");
		//head.displayData();
	}
}
