import java.util.Arrays;

public class AnagramChecker {
    public static void checkAnagrams(String str1, String str2) {
        // Convert strings to lowercase for case-insensitivity
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if (str1.length() == str2.length()) {
            // Convert strings to character arrays
            char[] str1CharArray = str1.toCharArray();
            char[] str2CharArray = str2.toCharArray();

            // Sort the character arrays
            Arrays.sort(str1CharArray);
            Arrays.sort(str2CharArray);

            // Check if both arrays are equal
            if (Arrays.equals(str1CharArray, str2CharArray)) {
                System.out.println("Strings \"" + str1 + "\" and \"" + str2 + "\" are anagrams.");
            } else {
                System.out.println("Strings \"" + str1 + "\" and \"" + str2 + "\" are not anagrams.");
            }
        } else {
            System.out.println("Strings \"" + str1 + "\" and \"" + str2 + "\" are not anagrams.");
        }
    }

    public static void main(String[] args) {
        // Test the function
        checkAnagrams("Heart", "Earth");
        checkAnagrams("Hello", "World");
        checkAnagrams("Listen", "Silent");
    }
}
