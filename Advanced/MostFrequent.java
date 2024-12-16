import java.util.HashMap;
import java.util.Map;

class MostFrequent {
    public int mostFrequent(int[] nums, int key) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        int maximumFrequency = 0;
        int mostFrequentElement = -1;

        // Iterate through the array, looking for the key
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == key) {
                int target = nums[i + 1]; // The element that follows the key
                // Update the frequency map
                frequencyMap.put(target, frequencyMap.getOrDefault(target, 0) + 1);
                
                // Check if this target is now the most frequent
                if (frequencyMap.get(target) > maximumFrequency) {
                    maximumFrequency = frequencyMap.get(target);
                    mostFrequentElement = target;
                }
            }
        }
        
        return mostFrequentElement;
    }
}