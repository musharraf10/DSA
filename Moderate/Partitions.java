class Partitions {
    public int countPartitions(int[] nums) {
        int n = nums.length;
        int count = 0;

        // Compute the total sum of the array
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }

        // Variable to track the sum of the left partition
        int leftSum = 0;

        // Iterate through the array to check partitions
        for (int i = 0; i < n - 1; i++) {
            leftSum += nums[i];
            int rightSum = totalSum - leftSum;

            // Check if the difference is even or zero
            if ((rightSum - leftSum) % 2 == 0 || (rightSum - leftSum) == 0) {
                count++;
            }
        }

        return count;
    }
}
