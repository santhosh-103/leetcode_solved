class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int ans=0;
        while(left<right){
            int width=right-left;
            int he=Math.min(height[right],height[left]);
            int water=width*he;
            ans=Math.max(water,ans);

            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return ans;
    }
}