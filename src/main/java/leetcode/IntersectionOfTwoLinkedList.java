package leetcode;

public class IntersectionOfTwoLinkedList {
	public static void main(String[] args) {
		ListNode headA = new ListNode(4);
		headA.next = new ListNode(1);
		headA.next.next = new ListNode(8);
		headA.next.next.next = new ListNode(4);
		headA.next.next.next.next = new ListNode(5);

		ListNode headB = new ListNode(5);
		headB.next = new ListNode(6);
		headB.next.next = new ListNode(1);
		headB.next.next.next = new ListNode(8);
		headB.next.next.next.next = new ListNode(4);
		headB.next.next.next.next.next = new ListNode(5);

		ListNode result = new IntersectionOfTwoLinkedList().getIntersectionNode(headA, headB);
		System.out.println(result);
	}



	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		if (headA == null || headB == null) {
			return null;
		}

		ListNode aPointer = headA;
		ListNode bPointer = headB;

		while (aPointer != bPointer) {
			if (aPointer == null) {
				aPointer = headB;
			} else {
				aPointer = aPointer.next;
			}

			if (bPointer == null) {
				bPointer = headA;
			} else {
				bPointer = bPointer.next;
			}
		}
		return aPointer;
	}
}
