class Solution {
    public int trap(int[] height) {
        int l=0;
        int r=height.length-1;
        int sum=0;
        int lmax =0, rmax=0;
        while(l<r){
            lmax = Math.max(lmax, height[l]);
            rmax = Math.max(rmax, height[r]);
            sum += lmax < rmax? lmax-height[l++]: rmax-height[r--];
        }
        return sum;
    }
}