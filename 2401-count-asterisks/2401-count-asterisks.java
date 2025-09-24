class Solution {
    public int countAsterisks(String s) {
        int asCount=0;
        int breakCount=0;
        char[] c=s.toCharArray();
        for(int i=0;i<c.length;i++){
            if(c[i]=='|'){
                breakCount++;
            }
            if(breakCount==0 && c[i]=='*'){
                asCount++;
            }
            if(breakCount>=2) breakCount=0;
            
        }
        return asCount;
    }
}