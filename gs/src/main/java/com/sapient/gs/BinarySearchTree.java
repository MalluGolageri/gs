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
	private static void preOrder(Node root) {
		if (root != null) {
			System.out.print(root.data + " ");			
			preOrder(root.left);			
			preOrder(root.right);
		}
	}
	private static void postOrder(Node root) {
		if (root != null) {
			postOrder(root.left);			
			postOrder(root.right);
			System.out.print(root.data + " ");
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
		Node root = null;		
		root=insert(root, 8);
		insert(root, 12);
		insert(root, 24);
		insert(root, 18);
		
		insert(root, 7);
		insert(root, 17);
		insert(root, 36);
		preOrder(root);
		System.out.print(contains(root, -23));

	}
}
