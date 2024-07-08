class Solution {
    private List<String> res = new ArrayList<>();
    public List<String> validStrings(int n) {
        char[] s = new char[n];
        for (int i = 0; i < n; i++) s[i] = '0';
        backtrack(0, false, s);
        return res;
    }
    private void backtrack(int index, boolean flag, char[] s){
        if (index == s.length){
            res.add(new String(s));
            return;
        }
        if (!flag) backtrack(index + 1, true, s);
        s[index] = '1';
        backtrack(index + 1, false, s);
        s[index] = '0';
    }
}