class Solution {
    public int[] minOperations(String boxes) {
        int n=boxes.length();
        int[] res=new int[n];
        for(int i=0;i<n;i++){
            int move=0;
            for(int j=0;j<n;j++){
                if(boxes.charAt(j)=='1')
                move+=Math.abs(i-j);
            }
            res[i]=move;
        }
        return res;
    }
}