import java.util.Stack;
import java.util.ArrayDeque;
import java.util.Deque;

public class IsPalindrome {

    public static boolean isPalindrome(int num) {
        String str = Integer.toString(num);
        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {
            stack.push(ch);
        }

        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        return str.equals(reversed.toString());
    }

    public static boolean isPalindrome1(int num) {
        String str = Integer.toString(num);
        Deque<Character> deque = new ArrayDeque<>();

        for (char ch : str.toCharArray()) {
            deque.add(ch);
        }

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }

        return true;
    }

}
