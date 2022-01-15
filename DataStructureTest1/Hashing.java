package DataStructureTest1;

class Node {
    int data;
    Node next;
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Hashing {
    int size;
    Node[] array;
    public Hashing(int size) {
        this.size = size;
        array = new Node[size];
    }

    private int hash(int key) {
        return key % size;
    }

    public void insert(int key) {
        int index = hash(key);
        if (array[index] == null) {
            array[index] = new Node(key);
        } else {
            Node temp = array[index];
            while(temp.next != null) temp = temp.next;
            temp.next = new Node(key);
        }
    }

    public void insertAll(int[] keys) {
        for(int key: keys)
            insert(key);
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(" | ");
            Node temp = array[i];
            while(temp != null) {
                System.out.print(temp.data + ", ");
                temp = temp.next;
            }
            System.out.print("\b\b | ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
    	Hashing Seperating_Hashing = new Hashing(5);
        Seperating_Hashing.insert(123);
        Seperating_Hashing.insert(134);
        Seperating_Hashing.insert(145);
        Seperating_Hashing.insert(143);
        Seperating_Hashing.insert(153);
        Seperating_Hashing.display();
    }

}


