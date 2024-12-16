public class TripletSum {
    public static boolean findTriplet(int[] arr, int target) {
        // Sort the array
        Arrays.sort(arr);

        // Iterate through the array
        for (int i = 0; i < arr.length - 2; i++) {
            // Use two pointers
            int left = i + 1;
            int right = arr.length - 1;

            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];

                if (sum == target) {
                    System.out.println("Triplet found: " + arr[i] + ", " + arr[left] + ", " + arr[right]);
                    return true;
                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        System.out.println("No triplet found.");
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {12, 3, 4, 1, 6, 9};
        int target = 24;

        findTriplet(arr, target);
    }
}