class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int smallest=1;
        for(int n:nums){
            if(n==smallest){
                smallest++;
            }
        }
        return smallest;
    }
}