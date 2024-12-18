import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueUsingStack {
    static Stack<Integer> s1 = new Stack<>();
    static Stack<Integer> s2 = new Stack<>();

    public static void add(int data) {
        s1.push(data);
    }

    public static int remove() {
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        return s2.pop();
    }

    public static int peek() {
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        return s2.peek();
    }

    public static void main(String[] args) {
        @SuppressWarnings("rawtypes")
        Queue q = new LinkedList<>();
        add(10);
        add(20);
        add(30);
        while (!q.isEmpty()) {
            System.out.print(q.peek() + " ");
            q.remove();
        }
    }
}
