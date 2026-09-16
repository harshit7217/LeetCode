class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int[] suffix = new int[n];
        int maxPrice = prices[n-1];

        for(int i=n-1; i>=0; i--){
            maxPrice = Math.max(maxPrice, prices[i]);
            suffix[i] = maxPrice - prices[i];
        }

        // for(int i=0; i<n; i++){
        //     System.out.print(suffix[i] +" ");
        // }

        int minPrice = prices[0];
        int preffix = 0;
        int answer = suffix[0];

        for(int i=1; i<n; i++){
            preffix = Math.max(preffix, prices[i] - minPrice);
            minPrice = Math.min(minPrice, prices[i]);
            answer = Math.max(answer, preffix + suffix[i]);
        }

        return answer;
    }
}