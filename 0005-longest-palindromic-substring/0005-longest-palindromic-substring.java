class Solution {
    public String longestPalindrome(String s) {
        int start=0;
        int end=0;
        for(int i=0;i<s.length();i++){
            int len1=func(s,i,i);//odd
            int len2=func(s,i,i+1);//even
            int len=Math.max(len1,len2);
            if(len>end-start){
                start=i-(len-1)/2;
                end=i+len/2;
            }

        }
        return s.substring(start,end+1);
       
    }
    public int func(String s,int left,int right){
        int l=left,r=right;
        while(l>=0 && r<s.length()&&s.charAt(l)==s.charAt(r)){
            l--;
            r++;
        }
        return r-l-1;
    }
}