package DataStructure;

class BST_class {
	class Node {
		int key;
		Node left, right;

		public Node(int data) {
			key = data;
			left = right = null;
		}
	}

	Node root;

	BST_class() {
		root = null;
	}

	void insert(int key) {
		root = insert_Recursive(root, key);
	}

	Node insert_Recursive(Node root, int key) {
		if (root == null) {
			root = new Node(key);
			return root;
		}
		if (key < root.key)
			root.left = insert_Recursive(root.left, key);
		else if (key > root.key)
			root.right = insert_Recursive(root.right, key);
		return root;
	}

	void inorder() {
		inorder_Recursive(root);
	}

	void inorder_Recursive(Node root) {
		if (root != null) {
			inorder_Recursive(root.left);
			System.out.print(root.key + " ");
			inorder_Recursive(root.right);
		}
	}
}

class BSTApp {
	public static void main(String[] args) {
		System.out.println("The suitable Traversal method is In-order Traversal\n");
		BST_class bst = new BST_class();

		bst.insert(52);
		bst.insert(11);
		bst.insert(10);
		bst.insert(13);
		bst.insert(91);
		bst.insert(57);
		System.out.println("The BST Created with input data: ");
		bst.inorder();
	}
}
