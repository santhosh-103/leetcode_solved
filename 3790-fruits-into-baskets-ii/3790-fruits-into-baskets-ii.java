class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        ArrayList<Integer> list=new ArrayList<>();
        int count=0;
        for(int i=0;i<fruits.length;i++){
            for(int j=0;j<baskets.length;j++){
                if(fruits[i]<=baskets[j]&&!list.contains(j)){
                    list.add(j);
                    count++;
                    break;
                }
            }
        }
        return fruits.length-count;
    }
}