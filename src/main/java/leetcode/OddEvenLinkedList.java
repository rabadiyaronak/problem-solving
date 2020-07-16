package leetcode;

public class OddEvenLinkedList {
	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);
		head.next.next.next.next.next = new ListNode(6);

		ListNode result = new OddEvenLinkedList().oddEvenList(head);
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

	public ListNode oddEvenList(ListNode head) {
		if (head == null) {
			return head;
		}

		ListNode odd = head;
		ListNode even = head.next;
		ListNode evenStart = even;

		while (true) {
			if (even == null || even.next == null) {
				odd.next = evenStart;
				return head;
			}

			odd.next = even.next;
			odd = even.next;

			if (odd.next == null) {
				even.next = null;
				odd.next = evenStart;
				return head;
			}

			even.next = odd.next;
			even = odd.next;
		}

	}
}
