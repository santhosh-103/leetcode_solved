class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] arr1=new int[n];
        int[] arr2=new int[n];
        for(int i=0;i<n;i++){
            arr1[i]=nums[i];
        }
        for(int i=n;i<nums.length;i++){
            arr2[i-n]=nums[i];
        }
        int res[]=new int[nums.length];
        int index=0;
        for(int i=0;i<n;i++){
            res[index++]=arr1[i];
            res[index++]=arr2[i];
        }
        return res;

    }
}