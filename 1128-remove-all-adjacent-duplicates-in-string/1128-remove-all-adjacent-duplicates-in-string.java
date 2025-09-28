class Solution {
    public String removeDuplicates(String s) {
        StringBuilder stack=new StringBuilder();
        for(char c:s.toCharArray()){
            int l=stack.length();
            if(l>0 && stack.charAt(l-1)==c) stack.deleteCharAt(l-1);
            else stack.append(c);
        }
        return stack.toString();
    }
}