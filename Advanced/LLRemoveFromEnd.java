class LLRemoveFromEnd{
    Node head;
    static class Node {
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }

    public void removeNthFromEnd(int n) {
        Node dummy = new Node(0);
        dummy.next = head;
        Node first = dummy, second = dummy;

        // Move first pointer n+1 steps ahead
        for (int i = 0; i <= n; i++) first = first.next;

        // Move first to the end while second follows
        while (first != null) {
            first = first.next;
            second = second.next;
        }

        // Remove nth node
        second.next = second.next.next;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
       LLRemoveFromEnd list = new LLRemoveFromEnd();
        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);
        list.head.next.next.next = new Node(4);
        list.head.next.next.next.next = new Node(5);

        list.removeNthFromEnd(2);
        list.printList();
    }
}
