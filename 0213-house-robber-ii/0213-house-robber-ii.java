class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n==1) return nums[0];
        if(n==2) return Math.max(nums[0], nums[1]);
        
        int max1 = helper(nums, 0, n-1);
        int max2 = helper(nums, 1, n);
        return (max1>max2)?max1:max2;
    }
    public int helper(int nums[], int s, int e){
        if(e-s==1) return nums[s];
        int dp[] = new int [e-s];
        dp[0] = nums[s];
        dp[1] = Math.max(nums[s], nums[s+1]);
        for(int i=s+2; i<e; i++){
            dp[i-s] = Math.max(nums[i]+dp[i-s-2], dp[i-s-1]);
        }
        return dp[dp.length-1];
    }
}