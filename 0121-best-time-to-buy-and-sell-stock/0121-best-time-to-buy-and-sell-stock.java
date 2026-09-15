class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i=0; i<prices.length; i++){
            if(prices[i] < min){
                min = prices[i];
            }

            int val = prices[i] - min;
            max = Math.max(max, val);
        }

        return max;
    }
}