class Solution {
    public int[] getNoZeroIntegers(int n) {
        for(int a=1;a<n;a++){
            int b=n-a;
            if(checkZero(a)&&checkZero(b)){
                return new int[]{a,b};
            }
        }
        return new int[]{};
    }
    public boolean checkZero(int num){
        while(num>0){
            if(num%10==0) return false;
            num/=10;
        }
        return true;
    }
}