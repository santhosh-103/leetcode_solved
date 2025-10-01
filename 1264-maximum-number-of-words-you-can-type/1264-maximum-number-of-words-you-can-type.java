class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] arr=text.split(" ");
        char[] c=brokenLetters.toCharArray();
        int ans=0;
        for(int i=0;i<arr.length;i++){
            int count=0;
            for(int j=0;j<c.length;j++){
                char ch=c[j];
                if(arr[i].contains(String.valueOf(ch))) {
                    count+=1;
                    break;
                }
            }
            if(count!=1) ans+=1;
        }
        return ans;
    }
}