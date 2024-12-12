class MaxProfit {
    public static int maxProfit(int n, int[] price) {
        // Edge cases
        if (n == 0 || price.length < 2) return 0;
    
        // Array to store the maximum profit up to each day (left to right)
        int[] leftProfit = new int[n];
        int minPrice = price[0];
    
        for (int i = 1; i < n; i++) {
            leftProfit[i] = Math.max(leftProfit[i - 1], price[i] - minPrice);
            minPrice = Math.min(minPrice, price[i]);
        }
    
        // Array to store the maximum profit from each day to the end (right to left)
        int[] rightProfit = new int[n];
        int maxPrice = price[n - 1];
    
        for (int i = n - 2; i >= 0; i--) {
            rightProfit[i] = Math.max(rightProfit[i + 1], maxPrice - price[i]);
            maxPrice = Math.max(maxPrice, price[i]);
        }
    
        // Find the maximum sum of profits from two transactions
        int maxProfit = 0;
        for (int i = 0; i < n; i++) {
            maxProfit = Math.max(maxProfit, leftProfit[i] + rightProfit[i]);
        }
    
        return maxProfit;
    }
    
    public static void main(String[] args) {
        int arr[] = {10, 22, 5, 75, 65,80};
        System.out.println("Max Profit: " + maxProfit(6, arr));
    }
}
