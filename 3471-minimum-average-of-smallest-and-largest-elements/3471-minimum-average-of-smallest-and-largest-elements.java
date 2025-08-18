class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        double avg=Double.MAX_VALUE;
        for(int i=0;i<n/2;i++){
            double min=(nums[i]+nums[n-i-1])/2.0;
            avg=Math.min(min,avg);
        }
        return avg;
    }
}