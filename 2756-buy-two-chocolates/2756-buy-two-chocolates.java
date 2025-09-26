class Solution {
    public int buyChoco(int[] prices, int money) {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            for(int j=i+1;j<prices.length;j++){
                min=Math.min(min,prices[i]+prices[j]);
            }
        }
        if(min>money) return money;
        return money-min;
    }
}