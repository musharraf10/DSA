class Node {
    int data;
    Node next;

    // Constructor to create a new node
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// LinkedList class
class LinkedList {
    Node head;

    // Method to push a new node at the beginning of the list
    public void push(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    // Method to print the linked list
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Method to segregate even and odd nodes
    public void segregateEvenOdd() {
        Node oddStart = null, oddEnd = null;
        Node evenStart = null, evenEnd = null;
        Node currNode = head;

        while (currNode != null) {
            // If the node is even
            if (currNode.data % 2 == 0) {
                if (evenStart == null) {
                    evenStart = evenEnd = currNode;
                } else {
                    evenEnd.next = currNode;
                    evenEnd = evenEnd.next;
                }
            }
            // If the node is odd
            else {
                if (oddStart == null) {
                    oddStart = oddEnd = currNode;
                } else {
                    oddEnd.next = currNode;
                    oddEnd = oddEnd.next;
                }
            }
            currNode = currNode.next;
        }

        // If there are no odd nodes
        if (oddStart == null) {
            head = evenStart;
            return;
        }

        // If there are no even nodes
        if (evenStart == null) {
            head = oddStart;
            return;
        }

        // Combine odd and even lists
        oddEnd.next = evenStart;
        evenEnd.next = null;
        head = oddStart;
    }

    // Main method to test the above functions
    public static void main(String[] args) {
        LinkedList llist = new LinkedList();
        llist.push(11);
        llist.push(10);
        llist.push(8);
        llist.push(7);
        llist.push(4);
        llist.push(3);

        System.out.println("Original Linked List:");
        llist.printList();

        llist.segregateEvenOdd();

        System.out.println("Linked List after segregating even and odd nodes:");
        llist.printList();
    }
}
