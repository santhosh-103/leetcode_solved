class Solution {
    public int minimizedStringLength(String s) {
        char[] c=s.toCharArray();
        HashSet<Character> set=new HashSet<>();
        for(char ch:c){
            set.add(ch);
        }
        return set.size();
    }
}