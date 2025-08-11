class Solution {
    public boolean isBalanced(String num) {
        char[] c=num.toCharArray();
        int even=0;
        int odd=0;
        for(int i=0;i<c.length;i++){
            if(i%2==0){
                even+=c[i]-'0';
            }
            else{
                odd+=c[i]-'0';
            }
        }
        return odd==even;
    }
}