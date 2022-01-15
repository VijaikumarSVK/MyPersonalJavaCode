package DataStructure;

import java.util.*;
import java.io.*;

class Node {
	String data;
	Node left;
	Node right;

	public Node(String data) {
		this.data = data;
	}

	public void insert(String value) {
		char ch = value.charAt(0);
		if (isVowel(ch)) {
			if (left == null) {
				left = new Node(value);
			} else
				left.insert(value);
		} else {
			if (right == null) {
				right = new Node(value);
			} else
				right.insert(value);
		}
	}

	private boolean isVowel(char ch) {
		ch = Character.toLowerCase(ch);
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
			return true;
		return false;
	}

	public void displayInOrder() {
		if (left != null) {
			left.displayInOrder();
		}
		System.out.print(data + " ");
		if (right != null) {
			right.displayInOrder();
		}
	}
}

public class Binary_tree {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		Node root = new Node("Root");
		System.out.println("Elements in Tree: ");
		root.displayInOrder();
		System.out.print("1. Insert\n2. Dispay\n3. quit/Exit");
		while (true) {
			System.out.print("\n\nYour choice: ");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.print("Enter the string: ");
				String str = sc.next();
				root.insert(str);
				System.out.print("Inserted Successfully!!");
				break;
			case 2:
				System.out.println("Elements in Tree: ");
				root.displayInOrder();
				break;
			case 3:
				System.out.println("Bye!");
				return;
			default:
				System.out.print("1. Insert\n2. Dispay\n3.quit/Exit");
			}
		}
	}
}