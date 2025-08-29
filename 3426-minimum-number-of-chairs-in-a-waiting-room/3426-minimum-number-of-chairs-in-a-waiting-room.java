class Solution {
    public int minimumChairs(String s) {
        char[] c=s.toCharArray();
        int max=0;
        int e=0;
        for(char ch:c){
            if(ch=='E'){
                e++;
            }
            else{
                e--;
            }
            max=Math.max(e,max);
        }
        return max;
    }
}