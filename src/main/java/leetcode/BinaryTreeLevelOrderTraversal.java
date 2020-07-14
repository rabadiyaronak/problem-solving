package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(9);
		root.right = new TreeNode(20);
		root.right.left = new TreeNode(15);
		root.right.right = new TreeNode(7);
//		TreeNode root = null;

		List<List<Integer>> levelOrder = new BinaryTreeLevelOrderTraversal().levelOrder(root);
		levelOrder.forEach(System.out::println);
	}

	public List<List<Integer>> levelOrder(TreeNode root) {

		if (root == null) {
			return Collections.emptyList();
		}

		List<List<Integer>> levelOrderList = new ArrayList<>();
		Queue<TreeNode> nodeQueue = new LinkedList<>();
		nodeQueue.add(root);

		TreeNode temp;
		List<Integer> levelList;
		while (!nodeQueue.isEmpty()) {
			int length = nodeQueue.size();
			levelList = new ArrayList<>();
			for (int i = 0; i < length; i++) {
				temp = nodeQueue.poll();
				levelList.add(temp.val);
				if (temp.left != null) {
					nodeQueue.add(temp.left);
				}

				if (temp.right != null) {
					nodeQueue.add(temp.right);
				}
			}
			levelOrderList.add(levelList);
		}

		return levelOrderList;
	}
}
