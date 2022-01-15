package DataStructure;

class Node {
	String name;
	char gender;
	Node next;

	Node(String name, char gender) {
		this.name = name;
		this.gender = gender;
		next = null;
	}
}

class StudentQueue {
	private Node front;
	private Node rear;
	private char section;

	public StudentQueue(char section) {
		front = rear = null;
		this.section = section;
	}

	public void addStudent(String name, char gender) {
		Node newNode = new Node(name, gender);
		if (isEmpty()) {
			front = rear = newNode;
			return;
		}
		rear.next = newNode;
		rear = newNode;
	}

	public void display() {
		if (isEmpty()) {
			System.out.println("No students available!!");
			return;
		}
		Node temp = front;
		System.out.println("Students in " + section + " section");
		while (temp != null) {
			System.out.print(temp.name + "(" + temp.gender + ") ");
			temp = temp.next;
		}
		System.out.println();
	}

	public Node removeStudent() {
		Node student = null;
		if (!isEmpty()) {
			if (front.next == null) {
				student = front;
				front = rear = null;
			} else {
				student = rear;
				Node temp = front;
				while (temp.next.next != null) {
					temp = temp.next;
				}
				rear = temp.next;
				temp.next = null;
			}
		}
		return student;
	}

	public boolean isEmpty() {
		return front == null;
	}
}

class CircularQueue {
	private Node front;
	private Node rear;
	private String category;

	public CircularQueue(String category) {
		front = rear = null;
		this.category = category;
	}

	public void enQueue(Node node) {
		if (isEmpty()) {
			front = rear = node;
			rear.next = front;
		} else {
			rear.next = node;
			rear = node;
			rear.next = front;
		}
	}

	public void display() {
		if (isEmpty()) {
			System.out.println("No " + category + " is available");
			return;
		}
		System.out.println("Circular linked list of " + category);
		Node temp = front;
		do {
			System.out.print(temp.name + "(" + temp.gender + ") ");
			temp = temp.next;
		} while (temp != front);
	}

	public boolean isEmpty() {
		return front == null;
	}
}

public class Assignment3 {
	public static void main(String[] args) {
		CircularQueue boysQueue = new CircularQueue("Boys");
		CircularQueue girlsQueue = new CircularQueue("Girls");
		StudentQueue lkg_A = new StudentQueue('A');
		StudentQueue lkg_B = new StudentQueue('B');
		lkg_A.addStudent("vijay", 'M');
		lkg_A.addStudent("ajith", 'M');
		lkg_B.addStudent("gayu", 'F');
		lkg_B.addStudent("janu", 'F');
		lkg_A.display();
		lkg_B.display();
	}

}
