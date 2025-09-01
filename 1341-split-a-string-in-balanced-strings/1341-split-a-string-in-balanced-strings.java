class Solution {
    public int balancedStringSplit(String s) {
        char[] c=s.toCharArray();
        int ansCount=0;
        int rCount=0;
        int lCount=0;
        for(char ch:c){
            if(ch=='R'){
                rCount++;
            }
            else if(ch=='L'){
                lCount++;
            }
            if(lCount==rCount){
                rCount=0;
                lCount=0;
                ansCount++;
            }
        }
        return ansCount;
    }
}