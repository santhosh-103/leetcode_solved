class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int count=0;
        for(int i=0;i<patterns.length;i++){
            String m=patterns[i];
            if(word.contains(m)) count++;
        }
        return count;
    }
}