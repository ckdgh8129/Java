package exam13;

public class MyLinkedList {
	private Node head;
	private int size = 0;
	
	private class Node {
		Object data;
		Node next;
		
		Node(Object input){
			this.data = input;
			this.next = null;
		}
	

		
	
	
	
		
		

	
		public Object get(int index) {
			Node temp = head;
			for(int i =0; i< index; i++) {
				temp = temp.next;
				return temp.data;
			}
	
	
	}
	public String toString() {
		if ( head==null) return"[]";
		
		Node temp = head;
		String str = "[";
		while (temp.next != null) {
			str += temp.data + ",";
			temp = temp.next;
		}
		return str + temp.data + "]";
	}


	public void addFirst(Object input) {
		Node newNode = new Node(input);
		newNode.next = head;
		head = newNode;
		size++;
		
	}
}
}