class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
       int n1=nums1.length;
       int n2=nums2.length;

       int[] res=new int[n1+n2];
       int index=0;
       for(int i=0;i<n1;i++){
        res[index++]=nums1[i];
       }
       for(int i=0;i<n2;i++){
        res[index++]=nums2[i];
       }
       Arrays.sort(res);
       int n=res.length;
       if(n%2==0){
        return (res[n/2-1] + res[n/2])/2.0 ;
       }
       else{
        return (res[n/2]);
       }
    }
}