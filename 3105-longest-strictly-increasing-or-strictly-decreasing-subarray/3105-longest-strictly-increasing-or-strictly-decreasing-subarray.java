class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int count1 = 1;
        int max = 1;
        int count2 = 1;
        for(int i=1; i<nums.length; i++){
            if(nums[i]>nums[i-1]) {
                count1++;
                max = (max<count1)?count1:max;
            } else count1 = 1;
            if(nums[i]<nums[i-1]) {
                count2++; 
                max = (max<count2)?count2:max; 
            } else count2 = 1;
        }
        return max;
    }
}