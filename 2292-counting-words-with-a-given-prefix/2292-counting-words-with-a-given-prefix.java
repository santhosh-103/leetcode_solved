class Solution {
    public int prefixCount(String[] words, String pref) {
        int n=pref.length();
        int count=0;
        for(String w:words){
            if(w.length()>=n){
            String a=w.substring(0,n);
            if(a.equals(pref)){
                count++;
            }
            }
            
        }
        return count;
    }
}