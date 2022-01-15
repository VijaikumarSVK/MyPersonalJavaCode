package Practice;

import java.util.Scanner;

public class CircularQueue {

	int front = -1;
	int rear = -1;
	int i;
	String element;
	int size;
	String arr[];

	CircularQueue(int size) {
		this.size = size;
		this.arr = new String[size];
	}

	public boolean isFull() {
		if (front == 0 && rear == size - 1) {
			return true;
		} else if (front == rear + 1) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isEmpty() {
		if (front == -1 && rear == -1) {
			return true;
		} else {
			return false;
		}
	}

	public void enQueue(String element) {

		if (isFull() == true) {
			System.out.println("Queue is Full..");
		} else {
			if (front == -1) {
				front = 0;
			}
			rear = (rear + 1) % size;
			arr[rear] = element;

			System.out.println("Inserted element is: " + element);

			System.out.println();
		}
	}

	public void deQueue() {

		if (isEmpty()) {
			System.out.println("Queue is UnderFlow...");
		} else {
			if (front == rear) {
				if (front > -1) {
					element = arr[front];
					System.out.println("deQueued element is: " + element);
				}
				front = -1;
				rear = -1;
				System.out.println("Queue is UnderFlow");
			} else {
				element = arr[front];
				front = (front + 1) % size;
				System.out.println("deQueued element is: " + element);
			}
		}
		System.out.println();
	}

	public void display() {
		if (isEmpty()) {
			System.out.println("Queue is UnderFlow");
		} else {
			System.out.println("Item in Queue..");
			System.out.println("Front is => " + arr[front]);
			for (i = front; i != rear; i = (i + 1) % size) {
				System.out.print(arr[i] + " ");
			}
			System.out.println(arr[i]);
		}
		System.out.println();
	}

	public static void main(String args[]) {
		int choice;
		String item;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the Queue");
		int size = sc.nextInt();
		CircularQueue obj = new CircularQueue(size);

		while (true) {
			System.out.println("Enter your choice: ");
			System.out.println("1.Enqueue");
			System.out.println("2.Dequeue");
			System.out.println("3.Display");
			System.out.println("4.Exit");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter the element to enQueue: ");
				item = sc.next();
				obj.enQueue(item);
				break;
			case 2:
				obj.deQueue();
				break;
			case 3:
				obj.display();
				break;
			case 4:
				System.out.println("***********Thank you*************");
				System.exit(1);
			}
		}
	}
}
