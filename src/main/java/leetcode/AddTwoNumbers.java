package leetcode;

public class AddTwoNumbers {

	public static void main(String[] args) {
		// add comma saperated value order wise to popuulate list node
//		String list1 = "2,4,3";
//		String list2 = "5,6,4";

		String list1 = "1";
		String list2 = "9,9";

		ListNode listNode1 = getListNode(list1);
		ListNode listNode2 = getListNode(list2);

		printList(listNode1);
		printList(listNode2);

		ListNode resultNode = new AddTwoNumbers().addTwoNumbers(listNode1, listNode2);

		System.out.println("resutl");
		printList(resultNode);
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

	private static ListNode getListNode(String list) {
		String[] vals = list.split(",");
		ListNode dummyRoot = new ListNode(0);
		ListNode ptr = dummyRoot;
		for (String val : vals) {
			ptr.next = new ListNode(Integer.parseInt(val));
			ptr = ptr.next;
		}
		return dummyRoot.next;
	}

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode ptr1 = l1;
		ListNode ptr2 = l2;
		ListNode dummyNode = new ListNode(0);
		ListNode resultNode = dummyNode;
		int rem = 0;
		int val = 0;
		while (ptr1 != null || ptr2 != null) {
			val += rem;
			if (ptr1 != null) {
				val += ptr1.val;
				ptr1 = ptr1.next;
			}
			if (ptr2 != null) {
				val += ptr2.val;
				ptr2 = ptr2.next;
			}

			if (val >= 10) {
				rem = val / 10;
				val = val % 10;
			} else {
				rem = 0;
			}
			resultNode.next = new ListNode(val);
			resultNode = resultNode.next;
			val = 0;
		}

		if (rem != 0) {
			resultNode.next = new ListNode(rem);
		}

		return dummyNode.next;
	}
}

class ListNode {
	int val;
	ListNode next;

	ListNode() {
	}

	ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
}
