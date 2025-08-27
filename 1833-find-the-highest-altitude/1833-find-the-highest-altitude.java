class Solution {
    public int largestAltitude(int[] gain) {
        int high=0;
        int max=0;
        for(int i=0;i<gain.length;i++){
            max=max+gain[i];
            high=Math.max(max,high);
            
        }
        return high;
        
    }
}