class Solution {
    public int totalMoney(int n) {
        int count=1;
        int c=1;
        int cc=1;
        int ans=0;
        while(count<=n){
            ans+=c;
            c++;
           
            if(count%7==0){
                cc++;
                c=cc;
                

            }
             count++;
        }
        return ans;
    }
}