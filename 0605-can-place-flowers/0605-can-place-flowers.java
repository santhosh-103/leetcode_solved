class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
       int l=flowerbed.length;
       if(l==1){
        if(flowerbed[0]==0&&n<=1) return true;
        else return n==0;
       }
       if(flowerbed[0]==0&&flowerbed[1]==0){
        n--;
        flowerbed[0]=1;
       }
       if(flowerbed[l-1]==0&&flowerbed[l-2]==0){
        n--;
        flowerbed[l-1]=1;
       }
       for(int i=1;i<flowerbed.length-1;i++){
        if(flowerbed[i-1]==0&&flowerbed[i]==0&&flowerbed[i+1]==0){
            n--;
            flowerbed[i]=1;
        }
       }
       return n<=0;
    }
}