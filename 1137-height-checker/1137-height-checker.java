class Solution {
    public int heightChecker(int[] heights) {
        int exp[]=new int[heights.length];
        for(int i=0;i<heights.length;i++){
            exp[i]=heights[i];
        }
        Arrays.sort(heights);
        int count=0;
        for(int i=0;i<heights.length;i++){
            if(heights[i]!=exp[i]) count++;
        }
        return count;
    }
}