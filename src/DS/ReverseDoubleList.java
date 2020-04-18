package DS;


public class ReverseDoubleList {
	static Node cursor;

	public static class Node {
		public int data;
		public Node previous;
		public Node next;

		public Node(int data) {
			this.data = data;
		}

	}

	public Node reverseLiked( ) {
		Node current = cursor;
		Node temp = null;

		while (current != null) {
			temp = current.previous;
			current.previous = current.next;
			current.next = temp;
			current = current.previous;

			if (temp != null)
				cursor = temp.previous;

		}
		return current;
	}

	public void printList(Node node) {
		while (node != null) {
			System.out.print(node.data);
			node = node.next;
		}

	}

	void push(int new_data) {
		/* allocate node */
		Node new_node = new Node(new_data);

		/*
		 * since we are adding at the beginning, prev is always NULL
		 */
		new_node.previous = null;

		/* link the old list off the new node */
		new_node.next = cursor;

		/* change prev of head node to new node */
		if (cursor != null) {
			cursor.previous = new_node;
		}

		/* move the head to point to the new node */
		cursor = new_node;
	}


    public static void main(String[] args) { 
    	ReverseDoubleList list = new ReverseDoubleList(); 
  
        /* Let us create a sorted linked list to test the functions 
         Created linked list will be 10->8->4->2 */
        list.push(2); 
        list.push(4); 
        list.push(8); 
        list.push(10); 
  
        System.out.println("Original linked list "); 
        list.printList(cursor); 
  
        list.reverseLiked(); 
        System.out.println(""); 
        System.out.println("The reversed Linked List is "); 
        list.printList(cursor); 
    } 
} 

