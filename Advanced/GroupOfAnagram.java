import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String word : strs) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);

            if (!map.containsKey(sortedWord)) {
                map.put(sortedWord, new ArrayList<>());
            }

            map.get(sortedWord).add(word);
        }

        return new ArrayList<>(map.values());
    }
}

public class GroupOfAnagram {
    public static void main(String[] args) {
        // Create an array to store counts of vowels 'a', 'e', 'i', 'o', 'u'
        int[] vowelCount = new int[5];

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String userInput = sc.nextLine();

        for (int i = 0; i < userInput.length(); i++) {
            char ch = userInput.charAt(i);
            if (ch == 'a') {
                vowelCount[0]++; // increment count for 'a'
            } else if (ch == 'e') {
                vowelCount[1]++; // increment count for 'e'
            } else if (ch == 'i') {
                vowelCount[2]++; // increment count for 'i'
            } else if (ch == 'o') {
                vowelCount[3]++; // increment count for 'o'
            } else if (ch == 'u') {
                vowelCount[4]++; // increment count for 'u'
            }
        }
        StringBuilder sb = new StringBuilder();
        String vowels = "aeiou";

        for (int i = 0; i < vowelCount.length; i++) {
            if (vowelCount[i] > 0) {
                sb.append(vowels.charAt(i)) // append the vowel
                        .append(": ") // append colon and space
                        .append(vowelCount[i]) // append the count
                        .append(" "); // append a space
            }
        }
        System.out.println(sb.toString());
        sc.close();
    }
}
