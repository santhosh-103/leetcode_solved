class Solution {
    public int maxPower(String s) {
       char[] c=s.toCharArray();
       int max=1;
       int count=1;
       for(int i=1;i<c.length;i++){
         char ch=c[i];
          if(c[i]==c[i-1]) count++;
          else count=1;
          max=Math.max(count,max);
       } 
       return max;
    }
}