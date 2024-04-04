class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==1 || (nums.length==2 && nums[0]==nums[1])) return 1;
        if(nums.length==2 && nums[0]!=nums[1]) return 2;
        int count = 1;
        for(int i=1; i<nums.length; i++){
            while(i<nums.length && nums[i-1]==nums[i]) i++;
            if(i<nums.length && (nums[i-1]!=nums[i])) nums[count++] = nums[i];
        }
        return count;
    }
}