public class DuplicatesString {
    
    public static void removeDuplicatesString(String str, String newStr, boolean[] map, int i) {
        if (i == str.length()) {
            System.out.println(newStr);
            return;
        }

        char currchar = str.charAt(i);

        if (currchar >= 'a' && currchar <= 'z') {
            if (map[currchar - 'a']) {
                removeDuplicatesString(str, newStr, map, i + 1);
            } else {
                map[currchar - 'a'] = true;
                removeDuplicatesString(str, newStr+currchar, map, i + 1);
            }
        } else {
            removeDuplicatesString(str, newStr+currchar, map, i + 1);
        }
    }

    public static void main(String[] args) {
        String str = "apna college";
        removeDuplicatesString(str, "", new boolean[26], 0);
    }
}




//Completed