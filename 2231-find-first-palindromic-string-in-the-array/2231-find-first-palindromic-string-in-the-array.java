class Solution {
    public String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++){
            String w=words[i];
            StringBuilder sb=new StringBuilder(words[i]).reverse();
            if(sb.toString().equals(w)){
                return words[i];
            }

        }
        return "";
    }
}