class LLFromEnd4th {
    Node head;
    static class Node {
        int data;
        Node next;
        Node(int d) { data = d; }
    }

    public void findFourthFromEnd() {
        Node first = head, second = head;

        for (int i = 0; i < 4; i++) {
            if (first == null) {
                System.out.println("List has fewer than 4 nodes.");
                return;
            }
            first = first.next;
        }

        while (first != null) {
            first = first.next;
            second = second.next;
        }
        System.out.println("Fourth node from end: " + second.data);
    }

    public static void main(String[] args) {
        LLFromEnd4th list = new LLFromEnd4th();
        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);
        list.head.next.next.next = new Node(4);
        list.head.next.next.next.next = new Node(5);

        list.findFourthFromEnd();
    }
}
