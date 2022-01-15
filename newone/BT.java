package newone;

import java.util.*;
import java.io.*;

public class BT {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		Node root = new Node("Root");
		System.out.println("Strings in Binary TREE: ");
		System.out.print("1. Insert\n2. Dispay\n3. Exit");
		while (true) {
			System.out.print("\n\nEnter Your choice: ");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.print("Enter the string: ");
				String str = sc.next();
				root.insert(str);
				System.out.print("Insertion done");
				break;
			case 2:
				System.out.println("Values in the Tree: ");
				root.displayInOrder();
				break;
			case 3:
				System.out.println("Good Bye");
				return;
			default:
				System.out.print("Enter the number between 1-3");
			}
		}
	}
}

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
