class Solution {
    public int findMiddleIndex(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        int leftSum=0;
        for(int i=0;i<nums.length;i++){
            sum-=nums[i];
            if(leftSum==sum){
                return i;
            }
            leftSum+=nums[i];
        }
        return -1;
    }
}