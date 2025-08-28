class Solution {
    public int totalMoney(int n) {
        int ans=0;
        int count=0;
        int a=1;
        int c=1;
        while(count<n){
            ans+=a;
            a++;
            count++;
            if(count%7==0){
               c++;
               a=c;
               
            }
        }
        return ans;
    }
}