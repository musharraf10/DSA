import java.util.Stack;

public class StackExample {

    // Function to add an element at the bottom of the stack
    public static void addBottom(Stack<Integer> st, int data) {
        if (st.isEmpty()) {
            st.push(data); // Base case: if stack is empty, push the data
        } else {
            int top = st.pop(); // Remove the top element
            addBottom(st, data); // Recursive call to add data at the bottom
            st.push(top); // Push the popped element back onto the stack
        }
    }

    public static void main(String[] args) {
        // Creating a Stack and adding elements
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);

        // Printing the original stack
        System.out.println("Original Stack: " + st);

        // Adding 4 to the bottom of the stack
        addBottom(st, 4); 

        // Printing the stack after adding 4 at the bottom
        System.out.println("Stack after adding 4 to bottom: " + st);
    }
}