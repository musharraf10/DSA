# Node class
class Node:
    def __init__(self, data):
        self.data = data
        self.next = None

# LinkedList class
class LinkedList:
    def __init__(self):
        self.head = None

    # Method to push a new node at the beginning of the list
    def push(self, new_data):
        new_node = Node(new_data)
        new_node.next = self.head
        self.head = new_node

    # Method to print the linked list
    def printList(self):
        temp = self.head
        while temp:
            print(temp.data, end=" ")
            temp = temp.next
        print()

    # Method to segregate even and odd nodes
    def segregateEvenOdd(self):
        oddStart = oddEnd = evenStart = evenEnd = None
        currNode = self.head

        while currNode:
            # If the node is even
            if currNode.data % 2 == 0:
                if evenStart is None:
                    evenStart = evenEnd = currNode
                else:
                    evenEnd.next = currNode
                    evenEnd = evenEnd.next
            # If the node is odd
            else:
                if oddStart is None:
                    oddStart = oddEnd = currNode
                else:
                    oddEnd.next = currNode
                    oddEnd = oddEnd.next

            currNode = currNode.next

        # If there are no odd nodes
        if oddStart is None:
            self.head = evenStart
            return

        # If there are no even nodes
        if evenStart is None:
            self.head = oddStart
            return

        # Combine odd and even lists
        oddEnd.next = evenStart
        evenEnd.next = None
        self.head = oddStart

# Example usage
llist = LinkedList()
llist.push(11)
llist.push(10)
llist.push(8)
llist.push(7)
llist.push(4)
llist.push(3)

print("Original Linked List:")
llist.printList()

llist.segregateEvenOdd()

print("Linked List after segregating even and odd nodes:")
llist.printList()
