class Solution {
    public int searchInsert(int[] nums, int target) {
        int index = nums.length;
        for(int i=nums.length-1; i>=0; i--){
            if(nums[i]==target) return i;
            else if(nums[i]>target) index = i;
        }
        return index;
    }
}