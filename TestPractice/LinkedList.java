package TestPractice;

import java.util.Scanner;

public class LinkedList {

	private class Node {
		String data;
		Node next;
	}

	private Node head;
	private Node tail;
	private int size;

	public int size() {
		return this.size;
	}

	public String getFirst() throws Exception {

		if (this.size == 0) {
			throw new Exception("LL is Empty.");
		}

		return this.head.data;
	}

	public String getLast() throws Exception {

		if (this.size == 0) {
			throw new Exception("LL is Empty.");
		}
		return this.tail.data;
	}

	public String getAt(int idx) throws Exception {

		if (this.size == 0) {
			throw new Exception("LL is Empty.");
		}

		if (idx < 0 || idx >= this.size) {
			throw new Exception("Invalid Index.");
		}

		Node temp = this.head;

		for (int i = 1; i <= idx; i++) {
			temp = temp.next;
		}

		return temp.data;
	}

	private Node getNodeAt(int idx) throws Exception {

		if (this.size == 0) {
			throw new Exception("LL is Empty.");
		}

		if (idx < 0 || idx >= this.size) {
			throw new Exception("Invalid Index.");
		}

		Node temp = this.head;

		for (int i = 1; i <= idx; i++) {
			temp = temp.next;
		}

		return temp;
	}

	public void addLast(String item) {

		// create
		Node nn = new Node();
		nn.data = item;
		nn.next = null;

		// attach
		if (this.size > 0)
			this.tail.next = nn;

		// dm update
		if (this.size == 0) {
			this.head = nn;
			this.tail = nn;
			this.size += 1;
		} else {
			this.tail = nn;
			this.size += 1;
		}
	}

	public void addFirst(String item) {

		// create
		Node nn = new Node();
		nn.data = item;
		nn.next = null;

		// attach
		nn.next = this.head;

		// dm update
		if (this.size == 0) {
			this.head = nn;
			this.tail = nn;
			this.size++;
		} else {
			this.head = nn;
			this.size++;
		}
	}

	public void addAt(String item, int idx) throws Exception {

		if (idx < 0 || idx > this.size) {
			throw new Exception("Invalid Index.");
		}

		if (idx == 0) {
			addFirst(item);
		} else if (idx == this.size) {
			addLast(item);
		} else {

			// create
			Node nn = new Node();
			nn.data = item;
			nn.next = null;

			// attach
			Node nm1 = getNodeAt(idx - 1);
			Node np1 = nm1.next;

			nm1.next = nn;
			nn.next = np1;

			// dm
			this.size++;
		}
	}



	public String removeLast() throws Exception {

		if (this.size == 0) {
			throw new Exception("LL is empty.");
		}

		Node temp = this.tail;

		if (this.size == 1) {
			this.head = null;
			this.tail = null;
			this.size = 0;
		} else {
			Node sm2 = getNodeAt(this.size - 2);
			sm2.next = null;
			this.tail = sm2;
			this.size--;
		}
		return temp.data;
	}

	public String removeAt(int idx) throws Exception {

		if (this.size == 0) {
			throw new Exception("LL is empty.");
		}

		if (idx < 0 || idx >= this.size) {
			throw new Exception("Invalid Index.");
		}

		if (idx == 0) {
			return null;
		} else if (idx == this.size - 1) {
			return removeLast();

		} else {

			Node nm1 = getNodeAt(idx - 1);
			Node n = nm1.next;
			Node np1 = n.next;

			nm1.next = np1;
			this.size--;

			return n.data;
		}
	}

	public void display() {

		System.out.println("----------------------");
		Node temp = this.head;

		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println(".");
		System.out.println("----------------------");

	}

	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		LinkedList list = new LinkedList();

		System.out.println("1.Create engine");
		System.out.println("2.Add Compartment Begin");
		System.out.println("3.Remove Compartment");
		System.out.println("4.Display all Compartment");
		System.out.println("5.Exit");

		while (true) {

			System.out.println("Enter your choice:");

			int choice = scan.nextInt();
			switch (choice) {
			case 1:
				list.addFirst("Engine");
				System.out.println("Engine attached:");
				break;
			case 2:
				System.out.println("Where you have to add:\n1.Add Compartment at any point\n2.Add Compartment End");
				int option = scan.nextInt();
				switch (option) {
				case 1:
					System.out.println("Enter Compartment to Add:");
					String compartment1 = scan.next();
					System.out.println("Enter the position to add:");
					String position = scan.next();
					list.addAt(compartment1, option);
					System.out.println(compartment1 + " is added at " + position);

					break;
				case 2:
					System.out.println("Enter Compartment to Add:");
					String compartment = scan.next();
					list.addLast(compartment);
					System.out.println(compartment + " is added at last");
					break;
				}
				break;
			case 3:
				System.out.println(
						"Where you have to Remove:\n1.Remove Compartment at any point\n2.Remove Compartment End");
				int option1 = scan.nextInt();
				switch (option1) {
				case 1:
					System.out.println("Enter the compartment place to remove:");
					int place = scan.nextInt();
					list.removeAt(place);
					break;
				case 2:
					list.removeLast();
					System.out.println("Last Compartment Deleted");
					break;
				}
				break;
			case 4:
				System.out.println("Compartment in the Train");
				list.display();
				break;
			case 5:
				System.out.println("*****Thank You*****");
				System.exit(1);
			default:
				System.out.println("Enter the value between 1-5");
			}
		}
	}
}
