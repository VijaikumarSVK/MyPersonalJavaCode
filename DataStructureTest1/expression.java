package DataStructureTest1;

import java.io.*;

class Node {
	public char data;
	public Node leftChild;
	public Node rightChild;

	public Node(char x) {
		data = x;
	}

	public void displayNode() {
		System.out.print(data);
	}
}

class stk1 {
	private Node[] a;
	private int top, m;

	public stk1(int max) {
		m = max;
		a = new Node[m];
		top = -1;
	}

	public void push(Node key) {
		a[++top] = key;
	}

	public Node pop() {
		return (a[top--]);
	}

	public boolean isEmpty() {
		return (top == -1);
	}
}

class stk2 {
	private char[] a;
	private int top, m;

	public stk2(int max) {
		m = max;
		a = new char[m];
		top = -1;
	}

	public void push(char key) {
		a[++top] = key;
	}

	public char pop() {
		return (a[top--]);
	}

	public boolean isEmpty() {
		return (top == -1);
	}
}

class convert {
	private stk2 s;
	private String input;
	private String output = "";

	public convert(String str) {
		input = str;
		s = new stk2(str.length());
	}

	public String val() {
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			switch (ch) {
			case '+':
			case '-':
				operator(ch, 1);
				break;
			case '*':
			case '/':
				operator(ch, 2);
				break;
			case '(':
				s.push(ch);
				break;
			case ')':
				paranthesis();
				break;
			default:
				output = output + ch;
			}
		}
		while (!s.isEmpty())
			output = output + s.pop();
		return output;
	}

	private void operator(char opThis, int prec1) {
		while (!s.isEmpty()) {
			char opTop = s.pop();
			if (opTop == '(') {
				s.push(opTop);
				break;
			} else {
				int prec2;
				if (opTop == '+' || opTop == '-')
					prec2 = 1;
				else
					prec2 = 2;
				if (prec2 < prec1) {
					s.push(opTop);
					break;
				} else
					output = output + opTop;
			}
		}
		s.push(opThis);
	}

	private void paranthesis() {
		while (!s.isEmpty()) {
			char ch = s.pop();
			if (ch == '(')
				break;
			else
				output = output + ch;
		}
	}
}

class Tree {
	private Node root;

	public Tree() {
		root = null;
	}

	public void insert(String s) {
		convert c = new convert(s);
		s = c.val();
		stk1 stk = new stk1(s.length());
		s = s + "#";
		int i = 0;
		char symbol = s.charAt(i);
		Node newNode;
		while (symbol != '#') {
			if (symbol >= '0' && symbol <= '9' || symbol >= 'A' && symbol <= 'Z' || symbol >= 'a' && symbol <= 'z') {
				newNode = new Node(symbol);
				stk.push(newNode);
			} else if (symbol == '+' || symbol == '-' || symbol == '/' || symbol == '*') {
				Node ptr1 = stk.pop();
				Node ptr2 = stk.pop();
				newNode = new Node(symbol);
				newNode.leftChild = ptr2;
				newNode.rightChild = ptr1;
				stk.push(newNode);
			}
			symbol = s.charAt(++i);
		}
		root = stk.pop();
	}

	public void traverse(int type) {

		System.out.print("Preorder Traversal:-    ");
		preOrder(root);

	}

	private void preOrder(Node localRoot) {
		if (localRoot != null) {
			localRoot.displayNode();
			preOrder(localRoot.leftChild);
			preOrder(localRoot.rightChild);
		}
	}

}

public class expression {
	public static void main(String args[]) throws IOException {
		String ch = "y";
		DataInputStream inp = new DataInputStream(System.in);

		Tree t1 = new Tree();
		System.out.println("Enter the Expression");
		String a = inp.readLine();
		t1.insert(a);
		t1.traverse(1);
		System.out.println("");
	}
}