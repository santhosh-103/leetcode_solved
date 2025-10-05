class Solution {
    public int romanToInt(String s) {
        int l=s.length();
        int[] arr = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case 'I':
                    arr[i] = 1;
                    break;
                case 'V':
                    arr[i] = 5;
                    break;
                case 'X':
                    arr[i] = 10;
                    break;
                case 'L':
                    arr[i] = 50;
                    break;
                case 'C':
                    arr[i] = 100;
                    break;
                case 'D':
                    arr[i] = 500;
                    break;
                case 'M':
                    arr[i] = 1000;
                    break;
            }

        }
        int sum = 0;
        for (int i = 0; i < l; i++) {
            if (i + 1 < l && arr[i + 1] > arr[i]) {
                sum += (arr[i + 1] - arr[i]);
                i++;
            } else {
                sum += arr[i];
            }
        }
        return sum;
    }
}