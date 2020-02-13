package DS;

/**
 * 
 * @author saraswathy
 *
 */
public class CircularLinked {

	// Represent a node of the doubly linked list

	class Node {
		int data;
		Node previous;
		Node next;


		public Node(int data) {
			this.data = data;
		}
	}

	// Represent the head and tail of the doubly linked list
	Node head, tail = null;

	// addNode() will add a node to the list
	public void addNode(int value) {

		Node newNode = new Node(value);

		if (head == null) {
			head = newNode;
		} else {
			tail.next = newNode;
		}

		tail = newNode;
		tail.next = head;
	}
	// display() will print out the nodes of the list
	public void display() {
		// Node current will point to head
		Node current = head;
		if (head == null) {
			System.out.println("List is empty");
			return;
		}
		System.out.println("Nodes of circularly linked list: ");
		while (current != null) {
			// Prints each node by incrementing the pointer.

			System.out.print(current.data + " ");
			current = current.next;
		}
	}

	/*
	 * finding elements Search
	 */
	public boolean containsNode(int searchValue) {
		Node currentNode = head;

		if (head == null) {
			return false;
		} else {
			do {
				if (currentNode.data == searchValue) {
					return true;
				}
				currentNode = currentNode.next;
			} while (currentNode != head);
			return false;
		}
	}

	/**
	 * Deleting entries in circular linked list
	 * 
	 * @param args
	 */

	public void deleteNode(int valueToDelete) {
		Node currentNode = head;

		if (head != null) {
			if (currentNode.data == valueToDelete) {
				head = head.next;
				tail.next = head;
			} else {
				do {
					Node nextNode = currentNode.next;
					if (nextNode.data == valueToDelete) {
						currentNode.next = nextNode.next;
						break;
					}
					currentNode = currentNode.next;
				} while (currentNode != head);
			}
		}
	}
	public static void main(String[] args) {

		DoublyLinkedList dList = new DoublyLinkedList();
		// Add nodes to the list
		dList.addNode(1);
		dList.addNode(2);
		dList.addNode(3);
		dList.addNode(4);
		dList.addNode(5);

		// Displays the nodes present in the list
		dList.display();
	}

}
