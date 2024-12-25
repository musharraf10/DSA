class LLPalindrome {
    Node head;

    // Node class to represent each element in the linked list
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public boolean checkPalindrome() {
        if (head == null || head.next == null) {
            return true; 
        }

        Node midNode = findMid(head);

        Node secondHalfHead = reverse(midNode);

        Node firstHalfHead = head;
        Node secondHalf = secondHalfHead;

        while (secondHalf != null) {
            if (firstHalfHead.data != secondHalf.data) {
                return false;
            }
            firstHalfHead = firstHalfHead.next;
            secondHalf = secondHalf.next;
        }

        return true;
    }

    // Helper method to find the middle of the list using two pointers (slow and fast)
    private Node findMid(Node head) {
        Node slow = head;
        Node fast = head;

        // Fast moves 2 steps while slow moves 1, so when fast reaches the end, slow is in the middle
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow; // Slow is now at the middle
    }

    // Helper method to reverse a linked list starting from the given node
    private Node reverse(Node head) {
        Node prev = null;
        Node curr = head;
        Node next;

        while (curr != null) {
            next = curr.next;  // Store next node
            curr.next = prev;  // Reverse the link
            prev = curr;       // Move prev to curr
            curr = next;       // Move curr to next node
        }

        return prev; // New head of the reversed list
    }

    // Method to add a new node to the end of the linked list
    public void append(int data) {
        if (head == null) {
            head = new Node(data);
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = new Node(data);
    }

    // Method to print the linked list (for testing purposes)
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Creating a palindrome linked list: 1 -> 2 -> 3 -> 2 -> 1
        list.append(1);
        list.append(2);
        list.append(3);
        list.append(2);
        list.append(1);

        System.out.print("Original List: ");
        list.printList();

        // Check if the linked list is a palindrome
        if (list.checkPalindrome()) {
            System.out.println("The linked list is a palindrome.");
        } else {
            System.out.println("The linked list is not a palindrome.");
        }
    }
}
