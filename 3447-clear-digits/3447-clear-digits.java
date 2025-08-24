class Solution {
    public String clearDigits(String s) {
        StringBuilder sb=new StringBuilder();
        char[] ch=s.toCharArray();
        for(char c:ch){
            if(Character.isDigit(c)){
                if(sb.length()>0){
                    sb.deleteCharAt(sb.length()-1);

                }
            }
            else{
                sb.append(c);
            }
        }
        return sb.toString();
    }
}