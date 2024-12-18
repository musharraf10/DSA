public class TrappingRainWater {

    public static int TrappedWater(int height[]) {
        int n = height.length;
        int left[] = new int[n];
        left[0] = height[0];
        for (int i = 1; i < n; i++) {
            left[i] = Math.max(height[i], left[i - 1]);
        }

        int right[] = new int[n];
        right[n - 1] = height[n - 1];
        for (int j = n - 2; j >= 0; j--) {
            right[j] = Math.max(height[j], right[j + 1]);
        }

        int TrappedWater = 0;
        for (int i = 0; i < n; i++) {
            int waterLevel = Math.min(left[i], right[i]);
            TrappedWater += waterLevel - height[i];
        }

        return TrappedWater;
    }

    public static int buysellStock(int prices[]) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (buyPrice < prices[i]) {
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        // int n[] = {4,2,0,6,3,2,5};
        int n1[] = { 5, 6, 2, 1, 0, 9, };
        System.out.println(TrappedWater(n1));
    }
}
