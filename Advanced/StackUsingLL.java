public class StackUsingLL {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class StackB {
        static Node head = null;

        // Check if the stack is empty
        public static boolean isEmpty() {
            return head == null;
        }

        // Push a new element onto the stack
        public static void push(int data) {
            Node newnode = new Node(data);
            newnode.next = head; // Point the new node to the current head
            head = newnode; // Update head to the new node
        }

        // Pop the top element from the stack
        public static int pop() {
            if (isEmpty()) {
                return -1;
            }
            int top = head.data; // Get the data at the top
            head = head.next; // Move the head to the next node
            return top;
        }

        // Peek at the top element without removing it
        public static int peek() {
            if (isEmpty()) {
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        StackB stack = new StackB();
        stack.push(6);
        stack.push(8);
        stack.push(7);

        // Print and pop all elements
        while (!stack.isEmpty()) {
            System.out.println(stack.peek());
            stack.pop();
        }
    }
}