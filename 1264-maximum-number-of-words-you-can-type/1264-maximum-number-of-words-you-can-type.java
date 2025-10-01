class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] arr=text.split(" ");
        char[] c=brokenLetters.toCharArray();
        int ans=0;
        for(int i=0;i<arr.length;i++){
            boolean e=true;
            for(int j=0;j<c.length;j++){
                char ch=c[j];
                if(arr[i].contains(String.valueOf(ch))) {
                    e=false;
                    break;
                }
            }
            if(e) ans+=1;
        }
        return ans;
    }
}