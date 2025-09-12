class Solution {
    public boolean doesAliceWin(String s) {
        char[] ch=s.toCharArray();
        int vowelsCount=0;
        for(char c:ch){
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') vowelsCount++;
        }
        return vowelsCount>0;
    }
}