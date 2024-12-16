class FindLonely {
    public List<Integer> findLonely(int[] nums) {
        Map<Integer, Integer> mp = new HashMap<>();
        
        
        for (int i = 0; i < nums.length; i++) {
            if (!mp.containsKey(nums[i])) {
                mp.put(nums[i], 1);
            } else {
                mp.put(nums[i], mp.get(nums[i]) + 1);
            }
        }

        List<Integer> ans = new ArrayList<>();
        
       
        for (int i = 0; i < nums.length; i++) {
            if (!mp.containsKey(nums[i] + 1) && 
                !mp.containsKey(nums[i] - 1) && 
                mp.get(nums[i]) == 1) {
                ans.add(nums[i]);
            }
        }
        
        return ans; 
    }
}