class Solution {
    public String restoreString(String s, int[] indices) {
        char[] c = s.toCharArray();
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < c.length; i++) {
            list.add(' ');
        }
        for (int i = 0; i < c.length; i++) {
            list.set(indices[i], c[i]);
        }
        String ans = "";
        for (int i = 0; i < list.size(); i++) {
            ans += list.get(i);
        }
        return ans;
    }
}