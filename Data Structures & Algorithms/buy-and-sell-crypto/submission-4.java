class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int buyingPrice = prices[0];

        for(int j=1; j<prices.length; j++){
            if(prices[j] > buyingPrice){
                maxProfit = Math.max(prices[j] - buyingPrice, maxProfit);
            }else{
                buyingPrice = prices[j];
            }
        }
        return maxProfit;
        
    }
}
