
public class Sorting {

	public static void insertionSort(int[] data){
		for(int i = 0; i < data.length; i++){
			for(int j = i; j < data.length; j++){
				if(data[i] < data[j]){
					int temp = data[j];
					data[j] = data[i];
					data[i] = temp;
				}
			}
		}
	}
	
	public static Node insertionSort(Node head){
		Node node = null;
		Node link = null;
		Node cursor = head;
		
		while(cursor != null && link != cursor){
			node = cursor;
			for(; node.getLink() != link; node = node.getLink()){
				if(node.getData() <= node.getLink().getData()){
					int temp = node.getData();
					node.setData(node.getLink().getData());
					node.getLink().setData(temp);
				}
			}
			
			link = node;
			cursor = head;
		}
			
		return node;
	}
	
	public static void mergeSort(int[] data, int first, int n){
		
	}
	
	public static Node mergeSort(Node head){
		Node node = head;
		
		return node;
	}
	
	public static void heapSort(int[] data){
		
	}
}
