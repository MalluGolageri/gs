package com.sapient.gs;
class BinarySearchTree {
	static class Node {
		public Node(int data) {
			this.data = data;
		}

		int data;
		Node left;
		Node right;
	}

	private static void display(Node root) {
		if (root != null) {
			display(root.left);
			System.out.print(root.data + " ");
			display(root.right);
		}
	}

	private static boolean contains(Node root, int key) {
		while (root != null) {
			if (key == root.data)
				return true;
			else if (key < root.data)
				root = root.left;
			else
				root = root.right;
		}
		return false;
	}

	private static Node insert(Node root, int key) {
		if (root == null)
			return new Node(key);
		if (key < root.data)
			root.left = insert(root.left, key);
		else
			root.right = insert(root.right, key);
		return root;

	}

	public static void main(String[] args) {

		Node root = new Node(20);
		root.left = new Node(10);
		root.right = new Node(30);

		insert(root, 40);
		insert(root, 25);
		insert(root, 27);
		insert(root, -23);
		display(root);

		System.out.print(contains(root, -23));

	}
}
