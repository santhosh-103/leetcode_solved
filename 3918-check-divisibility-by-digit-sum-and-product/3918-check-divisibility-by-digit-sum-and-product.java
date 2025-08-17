class Solution {
    public boolean checkDivisibility(int n) {
        int p=1;
        int sum=0;
        int org=n;
        while(n>0){
            int m=n%10;
            sum+=m;
            p*=m;
            n/=10;
        }
        return org%(sum+p)==0;
    }
}