class Solution {
    public String getSmallestString(String s, int k) {
        if(k==0) return s;
        char[] t = s.toCharArray();
        for (int i = 0; i < t.length; i++) {
            int currentDist = distToA(t[i]);
            if (k >= currentDist) {
                k -= currentDist;
                t[i] = 'a';
            } else {
                if (k > 0) {
                    if (t[i] - k >= 'a') t[i] = (char) (t[i] - k);
                    else t[i] = (char) ('z' - (k - 1));
                    k = 0;
                }
            }
        }
        return new String(t);
    }
    private int distToA(char c) {
        return Math.min(c - 'a', 26 - (c - 'a'));
    }
}