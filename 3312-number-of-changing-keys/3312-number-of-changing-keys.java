class Solution {
    public int countKeyChanges(String s) {
        s=s.toLowerCase();
        char[] c=s.toCharArray();
        int ans=0;
        for(int i=1;i<c.length;i++){
            if(c[i]!=c[i-1]){
                ans++;
            }
        }
        return ans;
    }
}