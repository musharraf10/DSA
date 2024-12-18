import java.util.Scanner;

public class LinearSearchStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a string array
        String[] words = { "apple", "banana", "cherry", "date", "elderberry" };

        // Get the word to search for
        System.out.print("Enter the word to search: ");
        String searchWord = scanner.nextLine();

        // Perform linear search
        boolean found = false;
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(searchWord)) {
                System.out.println("Word found at index: " + i);
                found = true;
                break;
            }
        }
        scanner.close();
        if (!found) {
            System.out.println("Word not found in the array.");
        }
    }
}