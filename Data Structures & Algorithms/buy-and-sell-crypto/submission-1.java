class Solution {
    public int maxProfit(int[] prices) {
        if(prices == null || prices.length<2) return 0;
        
        int bPriceIndex = 0;
        int sPriceIndex = 1;
        int maxProfit = Math.max(prices[sPriceIndex] - prices[bPriceIndex], 0);

        while(sPriceIndex < prices.length){
            if(prices[bPriceIndex]  < prices[sPriceIndex]){
                maxProfit = Math.max(maxProfit, prices[sPriceIndex] - prices[bPriceIndex]);
                sPriceIndex++;
            }else{
                bPriceIndex = sPriceIndex;
                sPriceIndex++;
            }
        }
        return maxProfit;
        
    }
}
