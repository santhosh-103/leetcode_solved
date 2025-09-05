class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int start=0;
        int end=nums.length-1;
        int max=0;
        while(end>start){
            int sum=nums[start]+nums[end];
            max=Math.max(sum,max);
            start++;
            end--;
        }
        return max;
    }
}