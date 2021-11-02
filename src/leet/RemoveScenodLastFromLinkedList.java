//package leet;
//
//public class RemoveScenodLastFromLinkedList {
//
//	/**
//	 * Definition for singly-linked list.
//	 */
//
//
//	public static ListNode removeNthFromEnd(ListNode head, int n) {
//
//		ListNode cur = head;
//		int numberOfNodes = 1;
//		while (cur.next != null) {
//			cur = cur.next;
//			numberOfNodes++;
//	    	}
//		int position = numberOfNodes - n;
//		ListNode temp = head;
//		if (position == 0) {
//			head = head.next;
//			return head;
//		}
//		while (position > 1) {
//			temp = temp.next;
//			position--;
//		}
//		if (temp.next == null)
//			temp = null;
//		else
//			temp.next = temp.next.next;
//		return head;
//	}
//
//	public static void main(String[] args) {
//		ListNode list = new ListNode(1);
//		ListNode list1 = new ListNode(2, list);
//		ListNode list2 = new ListNode(3, list1);
//		ListNode list3 = new ListNode(4, list2);
//
//		ListNode linked = removeNthFromEnd(list3, 1);
//		while (linked.next != null) {
//			System.out.println(linked.val);
//		}
//
//	}
//}
