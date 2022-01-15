package TestPractice;

import java.util.Scanner;

class Node {
	int data;
	Node next;

	public Node(int data) {
		this.data = data;
		this.next = null;
	}
}

public class PriorityQueue {
	Node front;

	public PriorityQueue() {
		front = null;
	}

	public void add(int data) {
		Node newNode = new Node(data);
		if (isEmpty()) {
			front = newNode;
			return;
		}
		Node current = front;
		Node prev = null;
		if (current.next == null) {
			if (data <= current.data) {
				newNode.next = front;
				front = newNode;
			} else
				current.next = newNode;
			return;
		}
		while (current != null && data >= current.data) {
			prev = current;
			current = current.next;
		}
		if (prev != null) {
			prev.next = newNode;
			newNode.next = current;
		} else {
			newNode.next = front;
			front = newNode;
		}
	}

	public void display() {
		if (isEmpty()) {
			System.out.println("No items available! in the list");
			return;
		}
		System.out.println("Elements in the list...");
		Node current = front;
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}

	public boolean isEmpty() {
		return front == null;
	}

	public static void main(String[] args) {
		PriorityQueue list = new PriorityQueue();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter N: ");
		int n = sc.nextInt();
		boolean isEven = false;
		if (n % 2 == 0)
			isEven = true;
		System.out.println("Enter " + n + " Integers");
		while (n-- > 0) {
			int num = sc.nextInt();
			if (isEven)
				list.add(num);
		}

		list.display();
	}
}
