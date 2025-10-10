class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int total=numBottles;
        while(numBottles>=numExchange){
            int a=numBottles/numExchange;
            int b=numBottles%numExchange;
            numBottles/=numExchange;
            total+=a;
            numBottles+=b;
        }
        return total;
    }
}