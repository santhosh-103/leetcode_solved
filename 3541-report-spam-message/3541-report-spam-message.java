class Solution {
    public boolean reportSpam(String[] message, String[] bannedWords) {
        HashSet<String> bannedSet=new HashSet<>();
        for(String c:bannedWords){
            bannedSet.add(c);
        }
        HashSet<String> set=new HashSet<>();
        int count=0;
        for(String c:message){
            if(bannedSet.contains(c)) count++;
        }
        return count>=2;


    }
}