class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs==null||strs.length==0) return "";
        String s=strs[0];
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            for(int j=1;j<strs.length;j++){
                if(i>=strs[j].length()||strs[j].charAt(i)!=c){
                    return sb.toString();
                }
                
            }
            sb.append(c);

        }
        return sb.toString();
    }
}