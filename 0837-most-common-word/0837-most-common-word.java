class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        paragraph=paragraph.toLowerCase().replaceAll("[!?',;.]"," ");
        String[] para=paragraph.split("\\s+");
        HashSet<String> bannedSet=new HashSet<>(Arrays.asList(banned));

        HashMap<String,Integer> map=new HashMap<>();
        for(String word:para){
            if(!bannedSet.contains(word)&&word!=" "){
                map.put(word,map.getOrDefault(word,0)+1);
            }
        }
        
        String res="";
        int max=0;
        for(String key:map.keySet()){
            if(map.get(key)>max){
                max=map.get(key);
                res=key;
            }
        }
        return res;
    }
}