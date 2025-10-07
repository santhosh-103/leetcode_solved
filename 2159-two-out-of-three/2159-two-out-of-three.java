class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        HashSet<Integer> set1=new HashSet<>();
        HashSet<Integer> set2=new HashSet<>();
        HashSet<Integer> set3=new HashSet<>();
        for(int i:nums1) set1.add(i);
        for(int i:nums2) set2.add(i);
        for(int i:nums3) set3.add(i);
        HashSet<Integer> res=new HashSet<>();
        for(int n:set1){
            if(set2.contains(n)||set3.contains(n)) res.add(n);
        }
        for(int n:set2){
            if(set3.contains(n)) res.add(n);
        }
        return new ArrayList<>(res);
    }
}