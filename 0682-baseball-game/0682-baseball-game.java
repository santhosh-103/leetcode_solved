class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack=new Stack<>();
        for(String s:operations){
            if(s.equals("C")){
                stack.pop();
            }
            else if(s.equals("+")){
                int last=stack.pop();
                int last2=stack.peek();
                stack.push(last);
                stack.push(last+last2);
            }
            else if(s.equals("D")){
                int n=stack.peek();
                stack.push(n*2);
            }
            else stack.push(Integer.parseInt(s));
        }
        int ans=0;
        for(int l:stack){
            ans+=l;
        }
        return ans;
    }
}