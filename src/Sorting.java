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
		System.out.println("Sort Start");
		int mid = (end+start)/2;
		int[] temp = new int[end-start];
		int j = 0;
		
		System.out.println(" Start " + start);
		System.out.println(" End " + end);
		
		for(int i = start; i < data.length && j < temp.length; i++) {
			temp[j++] = data[i];
		}
		
		for(int tempd : temp){
			System.out.println("Current Data " + tempd);
		}
		
		if(start < end){
			
			System.out.println("  Split 1");
			mergeSort(data, start, mid);
			
			System.out.println("  Split 2");
			mergeSort(data, mid+1, end);
			
			System.out.println("Merging");
			temp = merge(temp, start, end);
			j = 0;
			for(int i = start; i < end && j < temp.length; i++) {
				data[i] = temp[j++];
			}
			
			for(int tempd : data){
				System.out.println("Sorted Data " + tempd);
			}
		}
		
		return data;
	}
	private static int[] merge(int[] data, int start, int end){
		int left = (end-start)/2;
		int right = left+1;
		int counter = 0;
		int L[] = new int[left+1];
		int R[] = new int[right+1];
		int i = 0;
		int j = 0;
		
		System.out.println("   Data Length " + data.length);
		System.out.println("   Start: " + start);
		System.out.println("   End: " + end);
		System.out.println("    Left: " + left);
		System.out.println("    Right: " + right);

		if(data.length > 1) {
			for(i = 0; i < left && counter < data.length; i++){
				L[i] = data[counter++];
				System.out.println("  L[i] " + L[i]);
			}
	
			for(j = 0 ; j < right && counter < data.length; j++){
				R[j] = data[counter++];
				System.out.println("  R[j] " + R[j]);
			}
			
			i = 0;
			j = 0;
			counter = 0;
			
			while(i < left && j < right && counter < data.length){
				System.out.println("  Sub Arr: " + L[i] + " " + R[j]);
				System.out.println("  Counter: " + counter);
				System.out.println("  I " + i);
				System.out.println("  J " + j);
				System.out.println("  Data[Counter] " + data[counter]);
				if(L[i] < R[j]){
					data[counter] = R[j];
					j++;
				}else{
					data[counter] = L[i];
					i++;
				}
				
				counter++;
			}
			
			while(i < left) {
				data[counter++] = L[i++];
			}
			
			while(j < right & counter < data.length) {
				data[counter++] = R[j++];
			}
		}
		
		for(int temp : data){
			System.out.println("Result " + temp);
		}
		
		return data;
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
