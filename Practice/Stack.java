package Practice;

import java.util.Scanner;

import DataStructure.Stak;

public class Stack {

	static int size = 5;

	static int arr[] = new int[size];
	static int item;
	static int top = -1;
	static Scanner sc = new Scanner(System.in);

	public static void push(int item) {

		if (isFull() == 0) {
			System.out.println("Stack is Overflow...");
		} else {
			
			Stack.arr[++top] = item;
			System.out.println("value "+item+" is pushed...");
		
		}
	}

	public static void pop() {

		if (isEmpty() == 0) {
			System.out.println("Stack is UnderFlow...");
			System.out.println();
		} else {
			top--;
		}
	}

	public static void peek() {

		if (isEmpty() == 0) {
			System.out.println("Stack is UnderFlow...");
			System.out.println();
		} else {
			item = arr[top];
			System.out.print("The top element is: " + item);
		}
		System.out.println();
	}

	public static void display() {

		if (isEmpty() == 0) {
			System.out.println("Stack is UnderFlow...");
			System.out.println();
		} else {
			for (int i = 0; i < size; i++) {
				System.out.println(arr[i] + " ");
			}
		}
	}

	public static int isFull() {

		if (top == size) {
			return 0;
		} else {
			return 1;
		}
	}

	public static int isEmpty() {

		if (top == -1) {
			return 0;
		} else {
			return 1;
		}
	}

	public static void main(String args[]) {

		while (true) {
			System.out.println("Enter your choice");
			System.out.println("1.Push\n2.Pop\n3.Peek\n4.Display\n5.Exit");

			int choice = sc.nextInt();
			int element;

			Stack obj = new Stack();
			switch (choice) {
			case 1:
				System.out.println("Enter the value to push:");
				element = sc.nextInt();
				
				break;
			case 2:
				obj.pop();
				break;
			case 3:
				obj.peek();
				break;
			case 4:
				obj.display();
				break;
			case 5:
				System.out.println("***************Thank you***************");
				System.exit(1);
			default:
				System.out.println("Select the value between 1-5");
			}
		}

	}

}
