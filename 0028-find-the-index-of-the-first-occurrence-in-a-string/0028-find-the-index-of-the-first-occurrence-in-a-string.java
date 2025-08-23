class Solution {
    public int strStr(String haystack, String needle) {
       int m=haystack.length();
       int n=needle.length();

       if(n==0) return 0;
       for(int i=0;i<=m-n;i++){
        boolean found=true;
        for(int j=0;j<n;j++){
            if(haystack.charAt(i+j)!=needle.charAt(j)){
                found=false;
                break;
            }
        }
        if(found) return i;
       }
       return -1;

        
    }
}
