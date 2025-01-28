class Partitions {
    public int countPartitions(int[] nums) {
        int n = nums.length;
        int count = 0;

        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }

        int leftSum = 0;

        for (int i = 0; i < n - 1; i++) {
            leftSum += nums[i];
            int rightSum = totalSum - leftSum;

            if ((rightSum - leftSum) % 2 == 0 || (rightSum - leftSum) == 0) {
                count++;
            }
        }

        return count;
    }
}
