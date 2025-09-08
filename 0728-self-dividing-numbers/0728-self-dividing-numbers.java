class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=left;i<=right;i++){
            int n=i;
            int l=String.valueOf(n).length();
            int count=0;
            while(n>0){
                int a=n%10;
                n/=10;
                if(a!=0){
                   if(i%a==0) count++;
                }
                
            }
            if(count==l) list.add(i);
        }
        return list;
    }
}