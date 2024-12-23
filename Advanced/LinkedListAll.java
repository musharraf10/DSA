public class LinkedListAll {
    public class Node {
        int data;
        Node next;
        
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    public Node head;
    public Node tail;
    public int size;

    public LinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    // Add node at the beginning
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    // Add node at the end
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    // Print linked list
    public void print() {
        if (head == null) {
            System.out.println("Linked list is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Add node at a specific index
    public void add(int idx, int data) {
        if (idx == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        for (int i = 0; i < idx - 1; i++) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        size++;
    }

    // Remove the first node
    public void removeFirst() {
        if (size == 0) {
            System.out.println("Linked list is empty");
            return;
        }
        head = head.next;
        size--;
        if (size == 0) {
            tail = null;
        }
    }

    // Remove the last node
    public void removeLast() {
        if (size == 0) {
            System.out.println("Linked list is empty");
            return;
        }
        if (size == 1) {
            head = tail = null;
            size = 0;
            return;
        }
        Node temp = head;
        while (temp.next != tail) {
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
        size--;
    }

    // Search using iteration
    public int iSearch(int key) {
        Node temp = head;
        for (int i = 0; i < size; i++) {
            if (temp.data == key) {
                return i;
            }
            temp = temp.next;
        }
        return -1;
    }

    // Search using recursion
    public int helper(Node head, int key) {
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0;
        }
        int idx = helper(head.next, key);
        return idx == -1 ? -1 : idx + 1;
    }

    public int rSearch(int key) {
        return helper(head, key);
    }

    // Reverse the linked list
    public void reverse() {
        Node prev = null;
        Node curr = head;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        tail = head;
        head = prev;
    }

    // Delete nth node from end
    public void deleteFromNthPos(int n) {
        if (size == 0 || n > size) {
            System.out.println("Invalid position");
            return;
        }
        if (n == size) {
            removeFirst();
            return;
        }
        Node temp = head;
        for (int i = 1; i < size - n; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        if (temp.next == null) {
            tail = temp;
        }
        size--;
    }

    // Palindrome check
    public Node findMidNode(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public boolean isPalindrome() {
        if (head == null || head.next == null) {
            return true;
        }

        // Find the middle of the linked list
        Node midNode = findMidNode(head);

        // Reverse the second half
        Node prev = null;
        Node curr = midNode;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // Compare the two halves
        Node left = head;
        Node right = prev;
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }

        // Optional: Restore the list to its original form
        // Reverse the second half back

        return true;
    }

    // Detect cycle in linked list
    public boolean isCycle() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    // Remove cycle in linked list
    public void removeCycle() {
        Node slow = head;
        Node fast = head;
        boolean cycleExists = false;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                cycleExists = true;
                break;
            }
        }

        if (!cycleExists) {
            return;
        }

        slow = head;
        Node prev = null;
        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        prev.next = null; // Break the cycle
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.add(2, 9);

        ll.print();
        System.out.println(ll.size);

        ll.removeFirst();
        ll.print();
        System.out.println(ll.size);

        ll.removeLast();
        ll.print();
        System.out.println(ll.size);

        System.out.println(ll.iSearch(9));
        System.out.println(ll.iSearch(1));
        System.out.println(ll.rSearch(9));

        ll.reverse();
        ll.print();

        ll.deleteFromNthPos(3);
        ll.print();

        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(1);
        System.out.println(ll.isPalindrome());
    }
}
