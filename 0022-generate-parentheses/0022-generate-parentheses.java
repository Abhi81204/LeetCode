class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> s = new ArrayList<String>();
        backTrack("", n, s, 0, 0);
        return s;
    }
    public void backTrack(String curr, int n, List<String> s, int l, int r){
        if(curr.length() == n*2) {
            s.add(curr);
            return;
        }
        if(l<n){
             backTrack(curr+"(", n, s, l+1, r);
        }
        if(r<l){
             backTrack(curr+")", n, s, l, r+1);
        }
    }
}