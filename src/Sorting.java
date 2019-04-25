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
	
	public static void mergeSort(int[] data, int start, int end){
		System.out.println("Sort Start");
		int mid;
		
		System.out.println("  Start " + start);
		System.out.println("  End " + end);
		if(start < end){
			mid = (end+start)/2;
			
			System.out.println("  Mid " + mid);
			
			System.out.println("Split 1");
			mergeSort(data, start, mid);
			System.out.println("Split 2");
			mergeSort(data, mid+1, end);
			merge(data, start, mid, end);
		}
	}
	
	private static void merge(int[] data, int start, int mid, int end){
		System.out.println("merge");
		System.out.println("  Start " + start);
		System.out.println("  End " + end);
		System.out.println("  Mid " + mid);
		int left = (start+end)/2;
		int right = left+1;
		int counter;
		int L[] = new int[left];
		int R[] = new int[right];
		
		for(counter = 0; counter < left; counter++){
			L[counter] = data[counter];
		}

		for(counter = 0;counter < right; counter++){
			R[counter] = data[counter];
		}

		int i = 0;
		int j = 0;
		int temp;
		counter = 0;
		
		while(i < left && j < right && counter < data.length){
			System.out.println("  Sub Arr: " + L[i] + " " + R[j]);
			System.out.println("  Counter: " + counter);
			if(L[i] <= R[j]){
				data[counter] = L[i];
				i++;
			}else{
				data[counter] = R[j];
				j++;
			}
			
			System.out.println("  Data[counter]: " + data[counter]);
			counter++;
		}
		
		if(i < left && counter < data.length){
			while(i < left){
				data[counter] = L[i];
				i++;
			}
		}else if(j < right && counter < data.length){
			while(j < right){
				data[counter] = R[j];
				j++;
			}
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

		mergeSort(arr, 0, arr.length);
		
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
