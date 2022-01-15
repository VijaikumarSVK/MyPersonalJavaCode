package DataStructure;

import java.util.Scanner;

public class Linkedlist {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Queue queue = new Queue();
		System.out.println("1. Enter the String \n2. View palindrome strings \n3.(quit to exit)");
		while (true) {
			System.out.print("Your choice:");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.print("Enter the String: ");
				String myStr = scanner.next();
				int length = myStr.length();
				Stack myStack = new Stack();
				for (int i = 0; i < length; i++)
					myStack.push(myStr.substring(i, i + 1));
				String reversedStr = "";
				for (int i = 0; i < length; i++)
					reversedStr += myStack.pop();
				if (myStr.equals(reversedStr)) {
					System.out.println("Palindrome added");
					queue.enQueue(myStr);
				} else {
					System.out.println("Not a palindrome");
				}
				break;
			case 2:
				queue.display();
				break;
			case 3:
				System.out.println("Bye!");
				return;
			default:
				System.out.println("Enter choice (1-3)");
			}
		}
	}
}

class Node {
	String data;
	Node next;

	Node(String str) {
		data = str;
		next = null;
	}
}

class Stack {
	private Node head;
	private Node tail;

	Stack() {
		head = tail = null;
	}

	public void push(String data) {
		Node newNode = new Node(data);
		if (isEmpty()) {
			head = tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}
	}

	public String pop() {
		String data = "-";
		if (isEmpty()) {
			return data;
		}
		if (head == tail) {
			data = head.data;
			head = tail = null;
		} else {
			data = tail.data;
			Node temp = head;
			while (temp.next.next != null) {
				temp = temp.next;
			}
			temp.next = null;
			tail = temp;
		}
		return data;
	}

	public boolean isEmpty() {
		return head == null;
	}
}

class Queue {
	private Node front;
	private Node rear;

	public Queue() {
		front = rear = null;
	}

	public void enQueue(String data) {
		Node newNode = new Node(data);
		if (isEmpty()) {
			front = rear = newNode;
		} else {
			rear.next = newNode;
			rear = newNode;
		}
	}

	public void display() {
		if (isEmpty()) {
			System.out.println("Palindrome list is empty!");
			return;
		}
		Node temp = front;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}

	public boolean isEmpty() {
		return front == null;
	}
}

