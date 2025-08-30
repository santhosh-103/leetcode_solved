class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder ans=new StringBuilder();
        char[] c1=word1.toCharArray();
        char[] c2=word2.toCharArray();
        int max=Math.max(c1.length,c2.length);
        for(int i=0;i<max;i++){
            if(i<c1.length) ans.append(c1[i]);
            if(i<c2.length) ans.append(c2[i]);
        }
        return ans.toString();
    }
}