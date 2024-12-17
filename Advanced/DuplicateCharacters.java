import java.util.HashMap;

public class DuplicateCharacters {
    public static void findDuplicates(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        System.out.print("Duplicate characters: ");
        for (char key : map.keySet()) {
            if (map.get(key) > 1) {
                System.out.print(key + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        findDuplicates("programming");
        findDuplicates("hello");
    }
}
