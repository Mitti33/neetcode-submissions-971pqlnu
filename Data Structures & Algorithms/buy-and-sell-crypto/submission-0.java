class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = prices[0], max = 0;
        for(int i : prices){
            if(i < minPrice)
                minPrice = i;
            max = Math.max(max, (i - minPrice));
        }
        return max;
    }
}
