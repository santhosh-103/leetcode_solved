class Solution {
    public String removeStars(String s) {
        StringBuilder m=new StringBuilder();
        char[] c=s.toCharArray();
        int skip=0;
        for(int i=c.length-1;i>=0;i--){
            if(c[i]=='*') skip++;
            else{
                if(skip>0) skip--;
                else m.append(c[i]);
            }
        }
        return m.reverse().toString();
    }
}