import java.util.*;

class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> ans = new ArrayList<>();
        String digits = "123456789";
        int lowLen = String.valueOf(low).length();
        int highLen = String.valueOf(high).length();
        for (int len = lowLen; len <= highLen; len++) {
            for (int start = 0; start + len <= digits.length(); start++) {
                int num = Integer.parseInt(digits.substring(start, start + len));
                if (num >= low && num <= high) ans.add(num);
            }
        }
        Collections.sort(ans);
        return ans;
    }
}
