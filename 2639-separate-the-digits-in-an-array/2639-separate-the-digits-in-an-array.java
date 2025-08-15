class Solution {
    public int[] separateDigits(int[] nums) {
        StringBuilder sb=new StringBuilder();
        for(int n:nums){
            sb.append(n);
        }
        int res[]=new int[sb.length()];
        for(int i=0;i<sb.length();i++){
            res[i]=sb.charAt(i)-'0';
        }
        return res;
    }
}