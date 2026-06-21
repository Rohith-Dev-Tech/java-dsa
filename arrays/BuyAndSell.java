public class BuyAndSell {
    public int maxProfit(int[] prices) {
        int i = 0;
        int j = 1;
        int max = 0;
        while (j < prices.length) {
            if (prices[j] - prices[i] > max) {
                max = prices[j] - prices[i];
            } else if (prices[j] < prices[i]) {
                i = j;
            }
            j++;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        BuyAndSell solution = new BuyAndSell();
        int answer = solution.maxProfit(nums);
        System.out.println(answer);
    }
}
