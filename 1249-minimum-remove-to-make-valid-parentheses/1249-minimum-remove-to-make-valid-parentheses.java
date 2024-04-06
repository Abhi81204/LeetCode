class Solution {
    public String minRemoveToMakeValid(String s) {
        StringBuilder sb = new StringBuilder();
        StringBuilder res = new StringBuilder();
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                count++;
                sb.append(c);
            } else if (c == ')') {
                if (count > 0) {
                    count--;
                    sb.append(c);
                }
            } else sb.append(c);
        }
        for (int i = sb.length() - 1; i >= 0; i--) {
            if (sb.charAt(i) == '(' && count > 0) {
                count--;
                continue;
            }
            res.append(sb.charAt(i));
        }
        return res.reverse().toString();
    }
}
