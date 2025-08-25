class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
       StringBuilder s1=new StringBuilder();
       StringBuilder s2=new StringBuilder();
       for(String n:word1){
        s1.append(n);
       }
       for(String m:word2){
        s2.append(m);
       }
       return s1.toString().equals(s2.toString());
    }
}