class Solution {
    public int maxFreqSum(String s) {
        int[] freq=new int[26];
        for(char c:s.toCharArray()){
            freq[c-'a']++;
        }
        int v=0;
        int c=0;
        for(int i=0;i<26;i++){
            char ch=(char)(i+'a');
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                if(freq[i]>v) v=freq[i];
            }
            else{
                if(freq[i]>c) c=freq[i];
            }

        }
        return v+c;
    }
}