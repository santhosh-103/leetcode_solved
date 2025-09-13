class Solution {
    public String addSpaces(String s, int[] spaces) {
        char[] c=s.toCharArray();
        int count=0;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<c.length;i++){
        
            if(count<spaces.length&&i==spaces[count]){
                sb.append(" ");
                count++;
            }
            sb.append(c[i]);
        }
        return sb.toString();
        
    }
}