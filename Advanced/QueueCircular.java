public class QueueCircular {

    static class Queue {
        static int arr[];
        static int size;
        static int rear;
        static int front;

        // Constructor
        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }

        // Check if the queue is empty
        public static boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        // Check if the queue is full
        public static boolean isFull() {
            return (rear + 1) % size == front;
        }

        // Add elements to the queue
        public static void add(int data) {
            if (isFull()) {
                System.out.println("Queue is full");
                return;
            }
            if (front == -1) {
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        // Remove elements from the queue
        public static int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            int result = arr[front];
            // If the queue has only one element left
            if (rear == front) {
                front = rear = -1;
            } else {
                front = (front + 1) % size;
            }
            return result;
        }

        // Peek the front element of the queue
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[front];
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(3);
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.remove()); // Output: 1
        q.add(4);                       // Add 4 to the queue
        System.out.println(q.remove()); // Output: 2
        q.add(5);                       // Add 5 to the queue

        // Print all remaining elements in the queue
        while (!q.isEmpty()) {
            System.out.println(q.peek());  // Output: 3, 4, 5
            q.remove();                    // Remove the element after printing
        }
    }
}
