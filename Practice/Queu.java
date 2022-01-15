package Practice;

import java.util.Scanner;

public class Queu {
	int n = 5;
	int queue[] = new int[n];
	int front, rear = -1;

	public void enQueue(int x) {
		if (rear == n - 1) {
			System.out.println("Queue is overFlow...");
		} else if (front == -1 && rear == -1) {
			front = 0;
			rear = 0;
			queue[rear] = x;
		} else {
			rear++;
			queue[rear] = x;
			System.out.println(x + " is enQueued");
		}
		System.out.println();
	}

	public void deQueue() {

		if (front == -1 && rear == -1) {
			System.out.println("Queue is underFlow...");
		} else if (front == rear && rear == n - 1) {
			front = -1;
			rear = -1;
			System.out.println("Queue is fully deleted and Queue is again repeating mode...");
		} else if (front > rear && front < n - 1) {
			System.out.println("Queue is underFlow...");
		} else {
			System.out.println("deQueued value is: " + queue[front]);
			front++;
		}
		System.out.println();
	}

	public void display() {
		if (front == -1 && rear == -1) {
			System.out.println("Queue is underFlow...");
		} else {
			for (int i = front; i <= rear; i++) {
				System.out.print(queue[i] + " ");
			}
		}
		System.out.println();
	}

	public void peek() {
		if (front == -1 && rear == -1) {
			System.out.println("Queue is underFlow...");
		} else {
			System.out.println("The first value in the queue is: " + queue[front]);
		}
		System.out.println();
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Queu obj = new Queu();

		while (true) {

			System.out.println("Enter your choice");
			System.out.println("1.enQueue");
			System.out.println("2.deQueue");
			System.out.println("3.Display");
			System.out.println("4.Peek");
			System.out.println("5.Exit");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Enter the value to enQueue");
				int val = sc.nextInt();
				obj.enQueue(val);
				break;
			case 2:
				obj.deQueue();
				break;
			case 3:
				obj.display();
				break;
			case 4:
				obj.peek();
				break;
			case 5:
				System.out.println("************* Thank You ******************");
				System.exit(1);
			default:
				System.out.println("Enter the value between 1-4");
			}
		}
	}
}
