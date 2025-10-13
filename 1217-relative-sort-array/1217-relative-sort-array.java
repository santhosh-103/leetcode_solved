class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] res=new int[arr1.length];
        int index=0;
        for(int i=0;i<arr2.length;i++){
            for(int j=0;j<arr1.length;j++){
                if(arr2[i]==arr1[j]){
                   res[index++]=arr2[i];
                   arr1[j]=-1;
                }
            }
        }
        List<Integer> remaining=new ArrayList<>();
        for(int i:arr1){
            if(i!=-1)remaining.add(i);
        }
        Collections.sort(remaining);
        for(int i:remaining){
            res[index++]=i;
        }
        return res;
    }
}