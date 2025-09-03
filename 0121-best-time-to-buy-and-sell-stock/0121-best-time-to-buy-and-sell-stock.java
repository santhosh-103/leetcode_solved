class Solution {
    public int maxProfit(int[] prices) {
        if(prices==null||prices.length==0) return 0;
        int profit=0;
        int buying_price=prices[0];
        for(int price:prices){
            if(price<=buying_price){
                buying_price=price;
            }
            profit=Math.max(profit,price-buying_price);
        }
        return profit;
    }
}