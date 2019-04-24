
public class Node {
	
	private Integer nodeData;
	private Node nodeLink;
	
	public Node(Integer data, Node link){
		nodeData = data;
		nodeLink = link;
	}
	
	public Node addNodeAfter(int element){
		nodeLink = new Node(element, nodeLink);
		
		return nodeLink;
	}
	
	public boolean removeNodeAfer(){
		
		Node temp = nodeLink;
		
		if(nodeLink != null){
			nodeLink = nodeLink.getLink();
		}
		
		return temp != nodeLink;
	}
	
	public int getListLength(){
		Node cursor = this;
		int length = 1;
		while(cursor.getLink() != null){
			length++;
			cursor = cursor.getLink();
		}
		
		return length;
	}
	
	public static <T> int listLength(Node head){
		Node cursor = head;
		int length = 1;
		while(cursor.getLink() != null){
			length++;
			cursor = cursor.getLink();
		}
		
		return length;
	}
	
	public static <T> boolean listSearch (Node head, T target){ 
		Node cursor;
		
		for(cursor = head; cursor.getLink() != null; cursor = cursor.getLink()){
			if(target.equals(cursor.getData())){
				return true;
			}
		}
		
		return false;
	}

	public static Node reverseList(Node node){
		Node link;
		
		if(node == null || node.getLink() == null){
			return node;
		}
		
		link = reverseList(node.getLink());
		node.getLink().setLink(node);
		
		node.setLink(null);
		
		return link;
	}
	
	private static <T> void moveHeadData(Node node){
		int headData = node.getData();
		
		if(node == null || node.getLink() == null){
			return;
		}
		node.setData(node.getLink().getData());
		node.getLink().setData(headData);
		Node.moveHeadData(node.getLink());
	}
	
	public static void reverseData(Node node){
		
		if(node == null || node.getLink() == null){
			return;
		}
		
		Node.reverseData(node.getLink());
		Node.moveHeadData(node);
	}
	
	public static Node nodeAt(Node node, int position){
		int i = 1;
		Node cursor = node;
		
			while((i < position) && (cursor != null)){
				i++;
				cursor = cursor.getLink();
			}
			
			return cursor;
	}
	
	public void displayData(){
		Node cursor;
		
		for(cursor = this; cursor.getLink() != null; cursor = cursor.getLink()){
			System.out.println(cursor.getData());
		}
		System.out.println(cursor.getData());
	}
	
	@Override
	public String toString(){
		String link = null;
		String data = null;
		
		if(getLink() != null){
			link = getLink().toString();
			link = "\nLink: " + link;
		}else{
			link = "\nLink: " + link;
		}
		
		if(getData() != null){
			data = getData().toString();
			data = "\nData: " + data;
		}
		
		return data + link;
	}
	
	public Integer getData(){
		return nodeData;
	}
	
	public Node getLink(){
		return nodeLink;
	}
	
	public boolean hasLink(){
		return nodeLink != null;
	}
	
	public boolean hasData(){
		return nodeData != null;
	}
	
	public void setData(int data){
		nodeData = data;
	}
	
	public void setLink(Node link){
		nodeLink = link;
	}

}
