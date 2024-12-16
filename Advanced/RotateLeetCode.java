class RotateLeetCode {
    public void rotate(int[] nums, int k) {
        // Edge case: If the array is empty or k is 0, we don't need to rotate
        if (nums == null || nums.length == 0 || k == 0) {
            return;
        }
        
        // Reduce k to avoid unnecessary rotations
        k = k % nums.length; 
        
        
        reverse(nums, 0, nums.length - 1);
        
       
        reverse(nums, 0, k - 1);
        
        
        reverse(nums, k, nums.length - 1);
    }
    
    public void reverse(int[] arr, int i, int j) {
        while (i < j) {
           
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}