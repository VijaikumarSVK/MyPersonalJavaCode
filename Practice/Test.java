package Practice;
public class Test {
    private class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            next = null;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data +
                    '}';
        }
    }

    Node root;

    public Test() {
        root = null;
    }
    public void insertData(int data) {
        Node newNode = new Node(data);
        if(isEmpty()) {
            root = newNode;
            return;
        }
        Node temp = root;
        while(temp.next != null) temp = temp.next;
        temp.next = newNode;
    }

    public void insertAtFirst(int data) {
        Node newNode = new Node(data);
        if(isEmpty()) {
            root = newNode;
            return;
        }
        newNode.next = root;
        root = newNode;
    }

    public void insertAtPos(int pos, int data) {
        Node newNode = new Node(data);
        if(pos < 0) {
            System.out.println("enter a valid position");
            return;
        }
        if(isEmpty()) {        //if no elements available
            root = newNode;
            return;
        }
        if(pos == 0) {      //insert at beginning
            insertAtFirst(data);
            return;
        }
        Node temp = root;
        int count = 0;
        while(temp.next != null && count < pos-1) {     //traverse through the list until the position before you want to insert and check if you are not at the last element
            temp = temp.next;
            count++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void display() {
        if(!isEmpty()) {
            Node temp = root;
            while(temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public boolean isEmpty() {
        return root == null;
    }
}