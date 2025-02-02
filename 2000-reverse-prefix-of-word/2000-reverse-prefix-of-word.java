class Solution {
    public String reversePrefix(String word, char ch) {
        int i = word.indexOf(ch);
        if (i == -1) return word;
        char[] res = new char[i + 1];
        for (int j = i; j > -1; j--)
            res[i - j] = word.charAt(j);
        return new String(res) + word.substring(i + 1);
    }
}