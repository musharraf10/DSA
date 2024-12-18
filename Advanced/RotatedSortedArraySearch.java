public class RotatedSortedArraySearch {
    public static int search(int[] nums, int target) {
        int low = 0, high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            // Check if mid is the target
            if (nums[mid] == target) {
                return mid;
            }

            // Determine if left half is sorted
            if (nums[low] <= nums[mid]) {
                // Check if target lies in the sorted left half
                if (target >= nums[low] && target < nums[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                // Right half is sorted
                // Check if target lies in the sorted right half
                if (target > nums[mid] && target <= nums[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }

        // Target not found
        return -1;
    }

    public static void main(String[] args) {
        int[] nums1 = { 4, 5, 6, 7, 0, 1, 2 };
        int target1 = 0;
        System.out.println("Index of " + target1 + ": " + search(nums1, target1)); // Output: 4

        int[] nums2 = { 4, 5, 6, 7, 0, 1, 2 };
        int target2 = 3;
        System.out.println("Index of " + target2 + ": " + search(nums2, target2)); // Output: -1
    }
}
