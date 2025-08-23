class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int ans=0;
        for(String s:words){
            char[] c=s.toCharArray();
            int n=c.length;
            int count=0;
            for(int i=0;i<c.length;i++){
                if(allowed.contains(String.valueOf(c[i]))){
                    count++;
                }
                if(count==n) ans++;
            }
        }
        return ans;
    }
}