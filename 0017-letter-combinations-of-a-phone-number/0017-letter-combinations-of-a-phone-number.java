class Solution {
    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.length() == 0) {
            return new ArrayList<>();
        }
        String s[] = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        List<String> l = new ArrayList<>();
        backtrack("", digits, s, l, 0);
        return l;
    }
    public void backtrack(String curr, String digits, String s[], List<String> l, int i){
        if(digits.length()==i) {
            l.add(curr);
            return;
        }
        String p = s[digits.charAt(i)-'2'];
        for(int j=0; j<p.length(); j++){
                backtrack(curr+p.charAt(j), digits, s, l, i+1); 
        }
    }
    
}