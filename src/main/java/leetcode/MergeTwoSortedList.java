package leetcode;

public class MergeTwoSortedList {
	public static void main(String[] args) {
//		ListNode l1 = new ListNode(1);
//		l1.next = new ListNode(2);
//		l1.next.next = new ListNode(4);
//
//		ListNode l2 = new ListNode(1);
//		l2.next = new ListNode(3);
//		l2.next.next = new ListNode(4);
//		
		ListNode l1 = new ListNode(1);

		ListNode l2 = new ListNode(2);

		ListNode result = new MergeTwoSortedList().mergeTwoLists(l1, l2);
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

	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

		if (l1 == null && l2 == null) {
			return null;
		}
		if (l1 == null) {
			return l2;
		}
		if (l2 == null) {
			return l1;
		}
		ListNode result = new ListNode(-1);
		ListNode ptr = result;
		ListNode ptr1 = l1;
		ListNode ptr2 = l2;

		while (ptr1 != null && ptr2 != null) {
			if (ptr1.val < ptr2.val) {
				ptr.next = ptr1;
				ptr1 = ptr1.next;
			} else {
				ptr.next = ptr2;
				ptr2 = ptr2.next;
			}
			ptr = ptr.next;
		}

		while (ptr1 != null) {
			ptr.next = ptr1;
			ptr1 = ptr1.next;
			ptr = ptr.next;
		}

		while (ptr2 != null) {
			ptr.next = ptr2;
			ptr2 = ptr2.next;
			ptr = ptr.next;
		}
		return result.next;
	}
}
