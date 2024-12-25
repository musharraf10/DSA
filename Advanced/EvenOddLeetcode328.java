class Solution {
    public ListNode oddEvenList(ListNode head) {
        // Edge case: empty list or only one node
        if (head == null || head.next == null) {
            return head;
        }

        // Initialize pointers
        ListNode odd = head;          // First node, odd
        ListNode even = head.next;    // Second node, even
        ListNode evenHead = even;     // To remember the start of the even list
        
        // Traverse the list and rearrange the odd and even nodes
        while (even != null && even.next != null) {
            odd.next = odd.next.next;        // Skip even node
            even.next = even.next.next;      // Skip odd node
            odd = odd.next;                  // Move odd pointer
            even = even.next;                // Move even pointer
        }

        // Connect the end of the odd list to the head of the even list
        odd.next = evenHead;

        return head; // Return the head of the modified list
    }
}