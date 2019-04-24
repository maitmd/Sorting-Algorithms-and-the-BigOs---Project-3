
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
	
	public static void mergeSort(int[] data, int start, int end){
		int mid;
		
		if(end > 1){
			mid = (start + end)/2;
			
			mergeSort(data, start, mid);
			mergeSort(data, mid+1, end);
			
			merge(data, start, mid, end);
		}
	}
	
	public static void merge(int[] data, int start, int mid, int end){
		int tempStart = start;
		int tempMid = mid+1;
		
		int[] tempData = int[data.length];
		
		for(int i = start; i < end; i++){
			if(tempMid > mid)
		}
	}
	
	public static Node mergeSort(Node head){
		Node node = head;
		
		return node;
	}
	
	public static void heapSort(int[] data){
		
	}
}
