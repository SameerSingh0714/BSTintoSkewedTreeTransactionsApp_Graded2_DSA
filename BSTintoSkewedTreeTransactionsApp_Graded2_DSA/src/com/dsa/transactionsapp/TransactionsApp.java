/**
 * 
 */
package com.dsa.transactionsapp;

/**
 * @author Sameer
 *
 */

//Class of the node
class Node {
	int val;
	Node left, right;

	// code to add a new item
	Node(int item) {
		val = item;
		left = right = null;
	}
}

public class TransactionsApp {

	/**
	 * @param args
	 */

	public static Node node;
	static Node preNode = null;
	static Node headNode = null;

	// Function to to flatten the BST to ST
	static void flattenBTToSkewed(Node root, int order) {

		// Base Case
		if (root == null) {
			return;
		}

		// Condition to check the order
		// in which the skewed tree to maintained
		if (order > 0) {
			flattenBTToSkewed(root.right, order);
		} else {
			flattenBTToSkewed(root.left, order);
		}
		Node rightNode = root.right;
		Node leftNode = root.left;

		// Condition to check if the root Node
		// of the skewed tree is not defined
		if (headNode == null) {
			headNode = root;
			preNode = root;
			root.left = null;
		} else {
			preNode.right = root;
			preNode = root;
			root.left = null;
		}

		// Similarly recurse for the left / right
		// subtree on the basis of the order required
		if (order > 0) {
			flattenBTToSkewed(leftNode, order);
		} else {
			flattenBTToSkewed(rightNode, order);

		}
	}

	// Function to traverse the right
	// skewed tree using recursion
	static void traverseRightSkewed(Node root) {
		if (root == null) {
			return;
		}
		System.out.println(root.val + " ");
		traverseRightSkewed(root.right);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TransactionsApp tree = new TransactionsApp();

		tree.node = new Node(50);
		tree.node.left = new Node(30);
		tree.node.right = new Node(60);
		tree.node.left.left = new Node(10);
		tree.node.right.left = new Node(55);

		// Order of the Skewed tree can
		// be defined as follows -
		// For Increasing order - 0
		// For Decreasing order - 1
		int order = 0;
		flattenBTToSkewed(node, order);
		traverseRightSkewed(headNode);

	}

}
