class Solution {
    public int countSeniors(String[] details) {
       int count=0;
       for(String s:details){
        int n=Integer.parseInt(s.substring(11,13));
        if(n>60) count++;
       }
       return count;

    }
}
