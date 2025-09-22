class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int max=0;
        for(int freq:map.values()){
            if( freq>max) max=freq;
        }
        int sum=0;
        for(int key:map.values()){
            if(key==max) sum+=key;
        }

        return sum;
    }
}