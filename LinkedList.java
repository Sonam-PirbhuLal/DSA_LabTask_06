public class LinkedList {
    private Node top;

    public static class Node {
        private int data;
        public Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public void insertFirst(int data) {
        Node n = new Node(data);
        n.next = top;
        top = n;
    }

    public Node deleteFirst() {
        if (top == null) {
            System.out.println("List is empty, nothing to delete.");
            return null;
        }
        Node temp = top;
        top = top.next;
        return temp;
    }

    public void displayList() {
        Node current = top;
        if (current == null) {
            System.out.println("List is empty.");
            return;
        }
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertFirst(10);
        list.insertFirst(20);
        list.insertFirst(30);

        System.out.println("Initial list:");
        list.displayList();

        list.deleteFirst();
        System.out.println("List after deleting first element:");
        list.displayList();
    }
}


