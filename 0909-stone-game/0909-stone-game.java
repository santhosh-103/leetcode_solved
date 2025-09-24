class Solution {
    public boolean stoneGame(int[] piles) {
        int sum=0;
        for(int i=0;i<piles.length;i++){
            sum+=piles[i];
        }
        return sum%2!=0;
        
    }
}