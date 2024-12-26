import java.util.*;

public class StockSpan {
    public static void span(int stock[], int span[]) {
        Stack<Integer> s = new Stack<>();
        span[0] = 1; // The span for the first day is always 1
        s.push(0); // Push the index of the first element

        for (int i = 1; i < stock.length; i++) {
            // Pop elements from the stack while the current stock price is greater
            while (!s.isEmpty() && stock[i] >= stock[s.peek()]) {
                s.pop();
            }

            // If the stack is empty, it means the current price is greater than all previous prices
            if (s.isEmpty()) {
                span[i] = i + 1; // Span is the index + 1
            } else {
                // Otherwise, the span is the difference between the current index and the index of the last higher price
                span[i] = i - s.peek();
            }

            // Push the current index onto the stack
            s.push(i);
        }
    }

    public static void main(String[] args) {
        int stock[] = {100, 80, 60, 70, 60, 85, 100};
        int span[] = new int[stock.length];
        span(stock, span);
        
        // Print the span values
        for (int i = 0; i < stock.length; i++) {
            System.out.print(span[i] + " ");
        }
    }
}