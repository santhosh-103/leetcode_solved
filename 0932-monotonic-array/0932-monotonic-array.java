class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean dec=true;
        boolean inc=true;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1]){
                dec=false;
            }
            else if(nums[i]>nums[i+1]){
                inc=false;
            }
        }
        return dec||inc;
    }
}