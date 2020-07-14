package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class BinaryTreeInOrderTraversal {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.right = new TreeNode(2);
		root.right.left = new TreeNode(3);

		List<Integer> inorder = new BinaryTreeInOrderTraversal().inorderTraversal(root);
		System.out.println(inorder);

	}

	public List<Integer> inorderTraversal(TreeNode root) {

		List<Integer> inorder = new ArrayList<>();

		if (root == null) {
			return Collections.emptyList();
		}

		Stack<TreeNode> nodestack = new Stack<>();
		TreeNode current = root;

		while (current != null || !nodestack.isEmpty()) {
			while (current != null) {
				nodestack.push(current);
				current = current.left;
			}
			current = nodestack.pop();
			inorder.add(current.val);
			current = current.right;
		}

		return inorder;
	}

}
