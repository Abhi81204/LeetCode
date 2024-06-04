class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        int sum = 0;
        boolean odd = false;
        for(int i=0; i<s.length(); i++){
            if(hm.containsKey(s.charAt(i))) hm.put(s.charAt(i), hm.get(s.charAt(i))+1);
            else hm.put(s.charAt(i), 1);
        }
        for(int i: hm.values()){
            if(i%2==0) sum+=i;
            else {
                sum+=i-1;
                odd = true;
            }
        }
        if(odd) return sum+1;
        else return sum;
    }
}