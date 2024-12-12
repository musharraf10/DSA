public class ArrayShift {
    public static int[] leftshift(int nums[], int k) {
        int n = nums.length;
        int[] temp = new int[n];
        
        for (int i = 0; i < n; i++) {
            temp[i] = nums[(i + k) % n];
        }
        
        return temp; // Return the new shifted array
    }

    public static void main(String args[]) {
        int nums[] = {1, 2, 3, 4, 5};
        int k = 1; // Number of positions to shift
        nums = leftshift(nums, k); // Call the leftshift method
        System.out.println(Arrays.toString(nums)); // Print the shifted array
    }
}