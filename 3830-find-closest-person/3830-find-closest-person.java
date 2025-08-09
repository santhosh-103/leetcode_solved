class Solution {
    public int findClosest(int x, int y, int z) {
        while(true){
            if(x==z && y==z) return 0;
            if(x==z) return 1;
            if(y==z) return 2;
            if(x<z) x++;
            if(x>z) x--;
            if(y<z) y++;
            if(y>z) y--;
            
            
           

        }
        
        
    }
}