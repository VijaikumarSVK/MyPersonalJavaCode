package DataStructure;

import java.util.*;

public class Stak {

	static Scanner sc = new Scanner(System.in);
	static int stack[], size, top = -1;

	static {
		create();
	}

	public static void main(String args[]) {
		int choice, item;

		while (true) {
			System.out.println("1.Push");
			System.out.println("2.Pop");
			System.out.println("3.Peek");
			System.out.println("4.Iterate");
			System.out.println("5.exit");
			System.out.println("Enter your choice");
			choice = Stak.sc.nextInt();
			switch (choice) {
			case 1:
				int element;
				System.out.print("Enter the element to push: ");
				element = Stak.sc.nextInt();
				push(element);
				break;
			case 2:
				item = pop();

				if (item == 0) {
					System.out.println("Stack is underflow");
				} else {
					System.out.println("Poped element is: " + item);
				}
				break;
			case 3:
				item = peek();
				if (item == 0) {
					System.out.println("There is no element in the stack");
				} else {
					System.out.println("Top element in the Stack is: " + item);
				}
				break;
			case 4:
				iterate();
				break;
			case 5:
				System.out.println("Good bye");
				System.exit(1);
			}
		}
	}

	static void push(int item) {
		if (isFull()) {
			System.out.println("Stack is overflow");
		} else {
			Stak.stack[++top] = item;
		}
	}

	static int pop() {
		if (isEmpty()) {
			return 0;
		} else {
			return Stak.stack[top--];
		}
	}

	static int peek() {
		if (isEmpty()) {
			return 0;
		} else {
			return stack[top];
		}
	}

	static void iterate() {
		if (isEmpty()) {
			System.out.println("Stack is underflow");
		} else {
			for (int i = top; i >= 0; i--) {
				System.out.println(Stak.stack[i]);
			}
		}
	}

	static boolean isFull() {
		if (top == size - 1) {
			return true;
		} else {
			return false;
		}
	}

	static boolean isEmpty() {
		if (top == -1) {
			return true;
		} else {
			return false;
		}
	}

	static void create() {
		System.out.println("Enter the size of the array:");
		size = Stak.sc.nextInt();
		Stak.stack = new int[size];
		System.out.println("Stack is created in the size of: " + size);

	}

}
