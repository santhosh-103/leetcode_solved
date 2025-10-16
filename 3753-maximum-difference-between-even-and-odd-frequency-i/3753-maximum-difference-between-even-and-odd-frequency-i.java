class Solution {
    public int maxDifference(String s) {
       int[] fre=new int[26];
       for(char c:s.toCharArray()){
        fre[c-'a']++;
       }
       int maxOdd=Integer.MIN_VALUE;
       int minEven=Integer.MAX_VALUE;
       for(int i:fre){
        if(i==0) continue;
        if(i%2==0){
            if(i<minEven) minEven=i;
        }
        else{
            if(i>maxOdd) maxOdd=i;
        }
       }
       return maxOdd-minEven;

        
    }
}