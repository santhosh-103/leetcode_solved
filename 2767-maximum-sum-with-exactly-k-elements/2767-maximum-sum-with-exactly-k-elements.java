class Solution {
    public int maximizeSum(int[] nums, int k) {
        Arrays.sort(nums);
        int m=nums[nums.length-1];
        int sum=m;
        for(int i=1;i<k;i++){
            m++;
            sum+=m;
        }
        return sum;
    }
}