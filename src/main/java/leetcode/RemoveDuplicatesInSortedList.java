package leetcode;

public class RemoveDuplicatesInSortedList {
	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		head.next = new ListNode(1);
		head.next.next = new ListNode(2);
		head.next.next.next = new ListNode(3);
		head.next.next.next.next = new ListNode(3);
		ListNode result = new RemoveDuplicatesInSortedList().deleteDuplicates(head);
		printList(result);
	}

	private static void printList(ListNode head) {
		ListNode ptr = head;
		while (ptr != null) {
			System.out.print(ptr.val);
			if (ptr.next != null)
				System.out.print("->");
			ptr = ptr.next;
		}
		System.out.println();
	}

	public ListNode deleteDuplicates(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		ListNode ptr1 = head;
		ListNode ptr2 = head.next;

		while (ptr1 != null) {
			int val = ptr1.val;
			while (ptr2 != null) {
				if (ptr2.val == val) {
					ptr2 = ptr2.next;
				} else {
					break;
				}
			}
			ptr1.next = ptr2;
			ptr1 = ptr1.next;
		}

		return head;
	}
}

