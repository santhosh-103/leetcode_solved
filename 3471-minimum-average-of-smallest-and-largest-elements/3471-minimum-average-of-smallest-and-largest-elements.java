class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        double min=Double.MAX_VALUE;
        for(int i=0;i<n/2;i++){
            double ans=(nums[i]+nums[n-1-i])/2.0;
            min=Math.min(ans,min);
        }
        return min;
    }
}