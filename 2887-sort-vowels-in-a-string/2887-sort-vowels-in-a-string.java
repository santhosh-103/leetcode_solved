class Solution {
    public String sortVowels(String s) {
        char[] c=s.toCharArray();
        String vowels=""; 
        for(char ch:c){
            if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                vowels+=ch;
            }
        }
        char[] sorted=vowels.toCharArray();
        Arrays.sort(sorted);
        int index=0;
        String ans="";
        for(char ch:c){
            if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                ans+=sorted[index];
                index++;
            }else{
                ans+=ch;
            }
        }
        return ans;

    }
}