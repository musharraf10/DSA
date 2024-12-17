class LLFindMiddle {
    Node head;
    static class Node {
        int data;
        Node next;
        Node(int d) { data = d; }
    }

    public void findMiddle() {
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println("Middle element: " + slow.data);
    }

    public static void main(String[] args) {
        LLFindMiddle list = new LLFindMiddle();
        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);
        list.head.next.next.next = new Node(4);
        list.head.next.next.next.next = new Node(5);

        list.findMiddle();
    }
}
