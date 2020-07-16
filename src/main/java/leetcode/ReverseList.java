package leetcode;

public class ReverseList {
	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);

		ListNode result = new ReverseList().reverseList(head);
		printList(result);
	}

	private static void printList(ListNode root) {
		ListNode ptr = root;
		while (ptr != null) {
			System.out.print(ptr.val);
			if (ptr.next != null)
				System.out.print("->");
			ptr = ptr.next;
		}
		System.out.println();
	}

	public ListNode reverseList(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}

		ListNode current = head;
		ListNode prev = null;
		ListNode ahed = head.next;
		while (current != null) {
			current.next = prev;
			prev = current;
			current = ahed;

			if (ahed != null) {
				ahed = ahed.next;
			}
		}
		return prev;

	}
}
