class Solution {
    public int countSegments(String s) {
        
        s=s.trim();
        if(s.length()==0) return 0;
        s=s.replace("[!@#$%^&*()_+-=',.:]","");
        String[] res=s.split("\\s+");
       return res.length;
    }
}