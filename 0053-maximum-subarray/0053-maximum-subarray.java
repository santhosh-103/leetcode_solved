class Solution {
    public int maxSubArray(int[] nums) {
       int maxSum=nums[0];
       int currentSum=0;
       for(int i:nums){
        currentSum+=i;
        maxSum=Math.max(currentSum,maxSum);
        if(currentSum<0) currentSum=0;
       }
       return maxSum;
    }
}