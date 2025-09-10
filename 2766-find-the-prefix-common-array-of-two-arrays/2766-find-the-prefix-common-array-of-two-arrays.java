class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
       int n=A.length;
       int[] res=new int[n];
       int index=0;
       HashSet<Integer> set1=new HashSet<>();
       HashSet<Integer> set2=new HashSet<>();
       for(int i=0;i<n;i++){
        set1.add(A[i]);
        set2.add(B[i]);
        int commonCount=0;
        for(int num:set1){
            if(set2.contains(num)) commonCount++;
        }
        res[i]=commonCount;
       }
       return res;
    }
}