class Kadanes {
    public int maxSubArray(int[] nums) {
        int ms = Integer.MIN_VALUE; 
        int cs = 0;

        for (int i = 0; i < nums.length; i++) {
            cs += nums[i];
            ms = Math.max(cs, ms);
            if (cs < 0) {
                cs = 0;
            }
        }

        return ms;
    }
    public static void main(String[] args) {
        Kadanes k = new Kadanes();
        int[] nums = {-2,-3,-4,-1,-2,-5};
        System.out.println(k.maxSubArray(nums));
    }
}