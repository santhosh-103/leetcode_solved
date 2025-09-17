class Solution {
    public int[] maxKDistinct(int[] nums, int k) {
        TreeSet<Integer> set=new TreeSet<>();
        for(int n:nums){
            set.add(n);
        }
        List<Integer> list=new ArrayList<>(set);
        list.sort(Collections.reverseOrder());
        int n=Math.min(k,list.size());
        int[] arr=new int[n];
        int ind=0;
        for(int i=0;i<n;i++){
            arr[ind++]=list.get(i);
        }
        return arr;
    }
}