package DataStructure;

import java.util.Scanner;

public class Queue_Practice {

	static int Queue[], size, front = -1, rear = -1;
	static Scanner sc = new Scanner(System.in);

	static {
		create();
	}

	public static void main(String args[]) {
		int choice, element;
		while (true) {
			System.out.println("1.Enqueue");
			System.out.println("2.Dequeue");
			System.out.println("3.Iterater");
			System.out.println("4.exit");
			System.out.print("Enter your choice: ");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.print("Enter the item to Enqueue: ");
				element = sc.nextInt();
				enQueue(element);
				break;
			case 2:
				deQueue();
				break;
			case 3:
				iterate();
				break;
			case 4:
				System.out.println("Good bye");
				System.exit(1);
			default:
				System.out.println("Enter the number between 1-4");
			}
		}
	}

	static void enQueue(int item) {
		if (isFull()) {
			System.out.println("Queue is overflow");
		} else {
			if (front == -1) {
				front = 0;
			}
			rear++;
			Queue_Practice.Queue[rear] = item;
		}
	}

	static void deQueue() {
		if (isEmpty()) {
			System.out.println("Stack is underflow");
		} else {
			int item = Queue[front];
			System.out.println("Dequeued element is: " + item);
			front++;
		}
		if (front == size) {
			front = -1;
			rear = -1;
		}
	}

	static void iterate() {
		if (isEmpty()) {
			System.out.println("Stack is underflow");
		} else {
			System.out.print("Element in the queue ");
			for (int i = front; i <= rear; i++) {
				System.out.print(Queue[i] + " ");
			}
			System.out.println();
		}
	}

	static boolean isFull() {
		if (rear == size - 1) {
			return true;
		} else {
			return false;
		}

	}

	static boolean isEmpty() {
		if (rear == -1 || front > rear) {
			return true;
		} else {
			return false;
		}
	}

	static void create() {
		System.out.println("Enter the size of the queue");
		Queue_Practice.size = sc.nextInt();
		Queue_Practice.Queue = new int[size];
		System.out.println("Queue is created in the size of: " + size);
	}
}
