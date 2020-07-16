package leetcode;

/*
Write a function to delete a node (except the tail) in a singly linked list, given only access to that node.

Given linked list -- head = [4,5,1,9], which looks like following:
*/

public class DeleteNodeInLinkedList {

	public static void main(String[] args) {
		ListNode head = new ListNode(4);
		head.next = new ListNode(5);
		head.next.next = new ListNode(1);
		head.next.next.next = new ListNode(9);

		new DeleteNodeInLinkedList().deleteNode(head.next);

		printList(head);

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

	// Here given param is node to be deleted
	public void deleteNode(ListNode node) {
		while (node.next != null) {
			node.val = node.next.val;
			if (node.next.next == null) {
				node.next = null;
			} else {
				node = node.next;
			}
		}
	}
}
