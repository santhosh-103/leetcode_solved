class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count=0;
        for(int i=low;i<=high;i++){
            String n=String.valueOf(i);
            char[] c=n.toCharArray();
            if(c.length%2!=0) continue;
            int s1=0;
            int s2=0;
            for(int j=0;j<c.length/2;j++){
                 s1+=c[j]-'0';
            }
            for(int k=c.length/2;k<c.length;k++){
                 s2+=c[k]-'0';
            }
            if(s2==s1){
                count++;
            }
        }
        return count;
    }
}