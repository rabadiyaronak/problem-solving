package leetcode;

public class LinkedListCycle {
	public static void main(String[] args) {

		ListNode head = new ListNode(3);
		head.next = new ListNode(2);
		head.next.next = new ListNode(0);
		head.next.next.next = new ListNode(-4, head.next);

//		ListNode head = new ListNode(3);
//		head.next = new ListNode(2);
//		head.next.next = new ListNode(0);
//		head.next.next.next = new ListNode(-4);

		boolean result = new LinkedListCycle().hasCycle(head);
		System.out.println(result);

	}

	public boolean hasCycle(ListNode head) {
		if (head == null) {
			return false;
		}

		ListNode slowPtr = head;
		ListNode fastPtr = head.next;

		while (slowPtr != fastPtr) {

			if (fastPtr == null || fastPtr.next == null) {
				return false;
			}
			slowPtr = slowPtr.next;
			fastPtr = fastPtr.next.next;
		}

		return true;
	}

}
