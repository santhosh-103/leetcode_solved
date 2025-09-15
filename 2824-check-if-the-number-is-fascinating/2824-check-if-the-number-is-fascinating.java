class Solution {
    public boolean isFascinating(int n) {
        int n2=2*n;
        int n3=3*n;
        String s=""+n+n2+n3;
        char[] c=s.toCharArray();
        Arrays.sort(c);
        if(c.length!=9) return false;
        for(int i=0;i<9;i++){
             if (c[i] != (char) ('1' + i))  return false;
        }
        return true;

    }
}