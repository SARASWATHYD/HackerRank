package DS;

public class MyLinkedList {

	    class Node {
	        int value;
	        Node next;
	        Node prev;
	        
	        Node(){};
	        
	        Node(int value, Node prev, Node next){
	            this.value = value;
	            this.prev = prev;
	            this.next = next;
	        }
	    }
	    
	    Node head;
	    Node tail;
	    int length;
	    public MyLinkedList() {
	       Node head = null;
	        Node tail =null;
	        length = 0;
	        
	        }
	    
	    
	    
	    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
	    public int get(int index) {
	        if(index > length) return -1;
	       Node current = head; 
	        while(current.next!=null){
	            current = current.next;
	        }
		return current.value;
	    }
	    
	    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
	    public void addAtHead(int val) {
	        
	     Node node = new Node(val, null, head);

	        if(head == null){
	        head = node;
	        tail = node;
	        }
	    else {
	        head.prev = node;
	        head = node;
	        }
	        length++;
	        
	    }
	    
	    /** Append a node of value val to the last element of the linked list. */
	    public void addAtTail(int val) {
	        
	    Node node = new Node(val,tail,null);
	        if(tail == null){
	        head = node;
	        tail = node;
	        } else{
	            tail.next = node;
	            tail = node;
	    }
	        length++;
	    }
	    
	    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
	    public void addAtIndex(int index, int val) {
	        if(index > length) return;
	        if(index == 0) {
	        addAtHead(val);
	        return;
	        }
	        if(index == length){
	            addAtTail(val);
	            return;
	    } 
	        Node current = head;
	        while(index--!=0){
	 
	            current = current.next;
	        }
	        Node newNode = new Node(val, current.prev, current);
	        
	        current.prev.next = newNode;
	        current.prev = newNode;
	       length++;
	        return;
	    }
	    
	    /** Delete the index-th node in the linked list, if the index is valid. */
	    public void deleteAtIndex(int index) {
	        if(index >= length || index < 0) return;
	        if(index == 0){
	            head = head.next;
	              if(head != null) head.prev = null;
	            return;
	        }else if(index == length - 1){
	            tail = tail.prev;
	            tail.next = null;
	            length--;
	            return;
	        }
	       Node curNode = head;
	        while(index-- != 0){
	            curNode = curNode.next;
	        }
	        curNode.prev.next = curNode.next;
	        curNode.next.prev = curNode.prev;
	        length--;
	        return;
	    }
	}



