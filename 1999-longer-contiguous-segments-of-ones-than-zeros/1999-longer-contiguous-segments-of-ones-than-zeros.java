class Solution {
    public boolean checkZeroOnes(String s) {
        int one=0,zero=0;
        int maxOne=0,maxZero=0;
        for(char c:s.toCharArray()){
            if(c=='1'){
                zero=0;
                one++;
                maxOne=Math.max(maxOne,one);
            }else{
                one=0;
                zero++;
                maxZero=Math.max(maxZero,zero);
            }
        }
        return maxOne>maxZero;
    }
}