class Solution {
    Integer[][][] dp;
    int[] prices;
    int n;
    public int maxProfit(int k, int[] prices) {
        n = prices.length;
        this.prices = prices;
        dp = new Integer[n][k+1][2];

        return dfs(0, k, 0);
    }

    private int dfs(int day, int transcation, int isHolding){
        if(day >= n){
            return 0;
        }

        if(dp[day][transcation][isHolding] != null){
            return dp[day][transcation][isHolding];
        }

        int maxProfit = dfs(day + 1, transcation, isHolding);

        if(isHolding == 1){
            maxProfit = Math.max(maxProfit, prices[day] + dfs(day + 1, transcation, 0));
        }else if(transcation > 0){
            maxProfit = Math.max(maxProfit, -prices[day] + dfs(day + 1, transcation - 1, 1));
        }

        return dp[day][transcation][isHolding] = maxProfit;
    }
}