import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class IBM1 {
    public static void main(String[] args) {
        List<Integer> measurements = new ArrayList<>(Arrays.asList(-1, 3, 6, -5, 0)); 
        findMinimumDifferencePairs(measurements);
    }

    public static void findMinimumDifferencePairs(List<Integer> measurements) {
        Collections.sort(measurements);

        int minDiff = Integer.MAX_VALUE;
        List<int[]> pairs = new ArrayList<>();

        for (int i = 1; i < measurements.size(); i++) {
            int diff = measurements.get(i) - measurements.get(i - 1);
            if (diff < minDiff) {
                minDiff = diff;
                pairs.clear(); 
            }
            if (diff == minDiff) {
                pairs.add(new int[]{measurements.get(i - 1), measurements.get(i)});
            }
        }

        for (int[] pair : pairs) {
            System.out.println(pair[0] + " " + pair[1]);
        }
    }
}
