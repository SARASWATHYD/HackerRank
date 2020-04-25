package DS;

public class ReverseSinglyLinkedList {

	static Node cursor;

	static public class Node {
	int data;
	Node next;

		public Node(int data) {
		this.data = data;

		}
	}

	public Node reverseLiked(Node node) {
		Node current = node;
		Node next = null;
		Node prev = null;
		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		node = prev;

		return node;
	}

	public void printList(Node node) {
		while (node != null) {
			System.out.print(node.data + "->");
			node = node.next;
		}

	}

	public static void main(String ar[]) {
		final ReverseSinglyLinkedList list = new ReverseSinglyLinkedList();
		list.cursor = new Node(1);
		list.cursor.next = new Node(2);
		list.cursor.next.next = new Node(3);
		list.cursor.next.next.next = new Node(4);

		System.out.println("Given Linked list");
		list.printList(cursor);
		cursor = list.reverseLiked(cursor);
		System.out.println("");
		System.out.println("Reversed linked list ");
		list.printList(cursor);
	}

}
