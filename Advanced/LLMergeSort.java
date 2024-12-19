// Node class
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// LinkedList class
class LinkedList {
    Node head;

    // Add a new node at the beginning
    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Print the LinkedList
    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Merge Sort
    public Node mergeSort(Node head) {
        // Base case: if the list is empty or has only one element
        if (head == null || head.next == null) {
            return head;
        }

        // Step 1: Split the list into two halves
        Node mid = getMiddle(head);
        Node rightHalf = mid.next;
        mid.next = null;

        // Step 2: Recursively sort both halves
        Node left = mergeSort(head);
        Node right = mergeSort(rightHalf);

        // Step 3: Merge the sorted halves
        return merge(left, right);
    }

    // Find the middle of the LinkedList
    private Node getMiddle(Node head) {
        if (head == null) return head;

        Node slow = head, fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // Merge two sorted linked lists
    private Node merge(Node left, Node right) {
        Node dummy = new Node(-1);
        Node temp = dummy;

        while (left != null && right != null) {
            if (left.data <= right.data) {
                temp.next = left;
                left = left.next;
            } else {
                temp.next = right;
                right = right.next;
            }
            temp = temp.next;
        }

        // Attach remaining nodes
        if (left != null) {
            temp.next = left;
        }
        if (right != null) {
            temp.next = right;
        }

        return dummy.next;
    }
}

// Main class to test the implementation
public class LLMergeSort {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(5);
        ll.addFirst(3);
        ll.addFirst(8);
        ll.addFirst(2);
        ll.addFirst(1);

        System.out.println("Original List:");
        ll.print();

        ll.head = ll.mergeSort(ll.head);

        System.out.println("Sorted List:");
        ll.print();
    }
}
