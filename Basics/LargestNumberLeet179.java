import java.util.*;

class LargestNumberLeet179 {
    public String largestNumber(int[] nums) {
        // Convert integers to strings
        String[] pens = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            pens[i] = String.valueOf(nums[i]);
        }

        // Sort strings using custom comparator
        Arrays.sort(pens, (a, b) -> (b + a).compareTo(a + b));

        // If the largest number is '0', return "0"
        if (pens[0].equals("0")) {
            return "0";
        }

        // Build the result
        StringBuilder result = new StringBuilder();
        for (String pen : pens) {
            result.append(pen);
        }

        return result.toString();
    }
}
