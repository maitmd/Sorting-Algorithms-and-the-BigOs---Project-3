import java.util.ArrayList;

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
	
	public static int[] mergeSort(int[] data, int start, int end){
		if(start < end){
			int mid = (end+start)/2;
			
			mergeSort(data, start, mid);
			mergeSort(data, mid+1, end);
			
			merge(data, start, mid, end);
		}
		
		return data;
	}
	private static void merge(int[] data, int start, int mid, int end){
		
		int[] temp = new int[data.length];
		for (int i = start; i < end; i++) {
            temp[i] = data[i];
        }
		
        int i = start;
        int j = mid + 1;
        int k = start;
        
        while (i < mid && j < end) {
            if (temp[i] <= temp[j]) {
                data[k] = temp[j];
                j++;
            } else {
                data[k] = temp[i];
                i++;
            }
            k++;
        }
        while (i <= mid) {
            data[k] = temp[i];
            k++;
            i++;
        }
 
    }
	
	public static Node mergeSort(Node head){
		Node node = head;
		int length = node.getListLength();
		int[] arr = new int[length];
		int i = 0;
		
		while(i < length){
			arr[i] = node.getData();
			node = node.getLink();
			i++;
		}

		arr = mergeSort(arr, 0, arr.length);
		
		Node temp = new Node(arr[0], null);
		for(int tempint : arr){
			temp.addNodeAfter(tempint);
		}
		
		node = temp;
		
		return node;
	}
	public static void heapSort(int[] data){
		
	}
}
