class Solution {
    public String[] findWords(String[] words) {
        String row1="qwertyuiop";
        String row2="asdfghjkl";
        String row3="zxcvbnm";
        List<String> resultList = new ArrayList<>();
        for(int i=0;i<words.length;i++){
            String m=words[i].toLowerCase();
            char[] c=m.toCharArray();
            int row_1=0;
            int row_2=0;
            int row_3=0;
            for(char ch:c){
                if(row1.indexOf(ch) != -1) row_1++;
                if(row2.indexOf(ch) != -1) row_2++;
                if(row3.indexOf(ch) != -1) row_3++;
            }
            if(c.length==row_1||c.length==row_2||c.length==row_3){
                resultList.add(words[i]); 
            }
        }
        String[] res=new String[resultList.size()];
        int index=0;
        for(String s:resultList){
            res[index++]=s;
        }
        return res;
    }
}