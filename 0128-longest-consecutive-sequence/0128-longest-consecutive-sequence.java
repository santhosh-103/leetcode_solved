class Solution {
    public int longestConsecutive(int[] nums) {
        TreeSet<Integer> set=new TreeSet<>();
        for(int i:nums){
            set.add(i);
        }
        int res[]=new int[set.size()];
        int index=0;
        for(int i:set){
            res[index++]=i;
        }
        if(res.length==0||res.length==1) return res.length;
        int count=1,max=1;
        for(int i=0;i<res.length-1;i++){
            if(res[i]+1==res[i+1]){
            count++;
            }else{
              max=Math.max(count,max);
              count=1;
            }
        }
        max=Math.max(count,max);
        return max;
    }
}