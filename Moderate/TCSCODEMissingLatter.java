import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class TCSCODEMissingLatter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();  // Read the input sentence

        // Create a set to store all the letters of the alphabet
        Set<Character> allLetters = new HashSet<>();
        for (char c = 'a'; c <= 'z'; c++) {
            allLetters.add(c);
        }

        // Traverse the input string and remove found letters from the set
        for (char ch : sentence.toLowerCase().toCharArray()) {
            if (Character.isLetter(ch)) {
                allLetters.remove(ch);
            }
        }

        // If the set is empty, it means all letters are present, otherwise print missing letters
        if (allLetters.isEmpty()) {
            System.out.println(0);  // No missing letters, print 0
        } else {
            StringBuilder missingLetters = new StringBuilder();
            for (char missing : allLetters) {
                missingLetters.append(missing);
            }
            System.out.println(missingLetters.toString());  // Print missing letters in alphabetical order
        }
        
        sc.close();
    }
}
