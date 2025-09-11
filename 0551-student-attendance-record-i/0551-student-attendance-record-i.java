class Solution {
    public boolean checkRecord(String s) {
        char[] c=s.toCharArray();
        int countA=0;
        int countP=0;
        int countL=0;
        for(char ch:c){
            if(ch=='A'){
                countA++;
                countL=0;
            }
            if(ch=='L') countL++;
            if(ch=='P') countL=0;
            if(countL>=3||countA>=2) return false;
            
        }
        return true;
    }
}