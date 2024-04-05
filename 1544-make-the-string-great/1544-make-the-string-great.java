class Solution {
    public String makeGood(String s) {
        StringBuilder sb = new StringBuilder(s);
        int i=0;
        while(i<sb.length() - 1){
            char cur = sb.charAt(i);
            char next = sb.charAt(i+1);
            if(cur - next == 32 || next - cur == 32){
                sb.delete(i,i+2);
                if(i>0) i--;
            }else i++;
        }
        return sb.toString();
    }
}