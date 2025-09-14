class Solution {
    public String thousandSeparator(int n) {
        StringBuilder sb=new StringBuilder(String.valueOf(n));
        int s=sb.length();
        if(s<=3) return sb.toString();
        while(s>3){
            sb.insert(s-3,".");
            s-=3;
        }
        return sb.toString();
    
    }
}