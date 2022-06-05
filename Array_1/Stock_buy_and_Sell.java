package Array_1;

class Stock_buy_and_Sell {
    public int maxProfit(int[] prices) {
        int l = prices.length;
        int[] arr = new int[l];
        int maxprof = 0;
        arr[l - 1] = prices[l - 1];
        for (int i = l - 2; i >= 0; i--) {
            arr[i] = Math.max(arr[i + 1], prices[i]);
        }
        for (int i = 0; i < l; i++) {
            maxprof = Math.max(arr[i] - prices[i], maxprof);
        }
        return maxprof;
    }
}
// T.C - O(n) & S.C - O(n)
