class Solution {
    public int findMaxK(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        int max = -1;
        for(int i=0; i<nums.length; i++){
            hs.add(nums[i]);
        }
        for(int i=0; i<nums.length; i++){
            if(hs.contains(-nums[i])) {
                max = max<Math.abs(nums[i])?Math.abs(nums[i]):max;
            }
        }
        return max;
    }
}