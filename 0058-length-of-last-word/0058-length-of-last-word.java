class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0;
        for(int i=s.length()-1; i>=0; i--){
            while(s.charAt(i)==' ') i--;
            while(i>=0 && s.charAt(i)!=' '){
                count++;
                i--;
            }
            return count;
        }
        return 0;
    }
}