package DataStructure;

import java.util.Scanner;

public class ArrayLinkedList {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Queue queue = new Queue(10);
		System.out.println("1. Enter the String");
		System.out.println("2. View palindrome strings");
		System.out.println("3. Go to exit");
		while (true) {
			System.out.print("Enter Your choice:");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.print("Enter the String: ");
				String myStr = scanner.next();
				int length = myStr.length();
				Stack myStack = new Stack(length);
				for (int i = 0; i < length; i++) {
					myStack.push(myStr.charAt(i));
				}
				String reversedStr = "";
				for (int i = 0; i < length; i++) {
					reversedStr += myStack.pop();
				}
				if (myStr.equals(reversedStr)) {
					System.out.println("Given String is Palindrome And added in Queue");
					queue.addElem(myStr);
				} else {
					System.out.println("Given String is Not a Palindrome");
				}
				break;
			case 2:
				queue.dis();
				break;
			case 3:
				System.out.println("*********");
				return;
			default:
				System.out.println("Enter choice (1-3)");
			}
		}
	}
}

class Stack {
	private char[] stack;
	private int top;

	public Stack(int length) {
		stack = new char[length];
		top = -1;
	}

	public void push(char element) {
		stack[++top] = element;
	}

	public char pop() {
		if (top != -1) {
			return stack[top--];
		}
		return '-';
	}

	public void dis() {
		int i = 0;
		while (i <= top) {
			System.out.print(stack[i++]);
		}
	}
}

class Queue {
	private String[] queue;
	private int front;
	private int rear;

	public Queue(int cap) {
		if (cap < 2)
			cap = 2;
		queue = new String[cap];
		front = rear = -1;
	}

	public boolean isEmpty() {
		return front == -1;
	}

	public void addElem(String element) {
		if (isEmpty()) {
			front = rear = 0;
			queue[front] = element;
		} else {
			queue[++rear] = element;
		}
	}

	public void dis() {
		if (isEmpty()) {
			System.out.println("No Palindrome String is Entered");
		} else {
			int i = 0;
			while (i <= rear) {
				System.out.print(queue[i++] + " ");
			}
			System.out.println();
		}
	}
}
