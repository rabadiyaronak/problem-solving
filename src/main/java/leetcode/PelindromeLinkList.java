package leetcode;

import java.util.Stack;

public class PelindromeLinkList {
	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);

		boolean result = new PelindromeLinkList().isPalindrome(head);
		System.out.println(result);

		head.next.next = new ListNode(2);
		head.next.next.next = new ListNode(1);

		result = new PelindromeLinkList().isPalindrome(head);
		System.out.println(result);

	}

	public boolean isPalindrome(ListNode head) {
		if (head == null || head.next == null) {
			return true;
		}
		Stack<Integer> valueStack = new Stack<>();
		ListNode startFast = head;
		ListNode startSlow = head;
		while (startFast != null) {
			startFast = startFast.next;
			if (startFast != null) {
				valueStack.push(startSlow.val);
				startFast = startFast.next;
			}
			startSlow = startSlow.next;
		}

		while (startSlow != null) {
			int val = startSlow.val;
			startSlow = startSlow.next;
			if (val != valueStack.pop()) {
				return false;
			}

		}


		return true;
	}
}
