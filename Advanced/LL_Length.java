class LL_Length {
    Node head;
    static class Node {
        int data;
        Node next;
        Node(int d) { data = d; }
    }

    public int getLength() {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public static void main(String[] args) {
        LL_Length list = new LL_Length();
        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);
        System.out.println("Length of list: " + list.getLength());
    }
}
