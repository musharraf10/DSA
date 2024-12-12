public class DuplicatesString {
    
    public static void removeDuplicatesString(String str, String newStr, boolean[] map, int i) {
        if (i == str.length()) {
            System.out.println(newStr);
            return;
        }

        char currchar = str.charAt(i);

        // Check if the character is a lowercase letter
        if (currchar >= 'a' && currchar <= 'z') {
            // If already encountered, skip it
            if (map[currchar - 'a']) {
                removeDuplicatesString(str, newStr, map, i + 1);
            } else {
                // Mark the character as encountered and append it to the result
                map[currchar - 'a'] = true;
                removeDuplicatesString(str, newStr+currchar, map, i + 1);
            }
        } else {
            // If not a lowercase letter, append as is
            removeDuplicatesString(str, newStr+currchar, map, i + 1);
        }
    }

    public static void main(String[] args) {
        String str = "apna college";
        removeDuplicatesString(str, "", new boolean[26], 0);
    }
}




