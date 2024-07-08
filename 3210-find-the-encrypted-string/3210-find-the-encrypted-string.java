class Solution {
    public String getEncryptedString(String s, int k) {
        String res = "";
        for(int i=0; i<s.length(); i++) res += s.charAt((i+k)%s.length());
        return res;
    }
}