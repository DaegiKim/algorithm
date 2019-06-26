package leetcode.top_interview_questions_easy.array._564;

class Solution {
    public int maxProfit(int[] prices) {
        int purchase = 0;
        int profit = 0;
        boolean hasStock = false;

        for(int i=0; i<prices.length-1; i++) {
            if(prices[i]<=prices[i+1]) {
                if(!hasStock) {
                    purchase = prices[i];
                    hasStock = true;
                }
            }

            if(hasStock && prices[i]>prices[i+1]) {
                profit += prices[i]-purchase;
                purchase = 0;
                hasStock = false;
            }
        }

        if(hasStock) {
            profit+=prices[prices.length-1]-purchase;
        }

        return profit;
    }
}
