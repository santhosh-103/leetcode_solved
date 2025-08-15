class Solution {
    public boolean canAliceWin(int[] nums) {
        if(nums.length==2) return true;
        int single=0;
        int doubl=0;
        for(int i=0;i<nums.length;i++){
            int l=String.valueOf(Math.abs(nums[i])).length();
            if(l==1){
                single+=nums[i];
            }
            else{
                doubl+=nums[i];
            }
        }
        return single!=doubl;
    }
}