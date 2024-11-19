public class LinkedListStack {
    
    LinkedList li = new LinkedList();

    public void push(int element) {
        li.insertFirst(element);
    }

    public void pop() {
        li.deleteFirst();
    }

    public void displayStack() {
        System.out.println();
        li.displayList();
    }

    public static class LLStackClient {
        public static void main(String[] args) {
            LinkedListStack st = new LinkedListStack();  
            st.push(50);
            st.push(70);
            st.push(190);
            System.out.println("Stack after push operation: ");
            st.displayStack();

            System.out.println("\nStack after pop operation");  
            st.pop();
            st.displayStack();
        }
    }
}
