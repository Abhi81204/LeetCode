class Solution {
    public int removeElement(int[] nums, int val) {
        int k = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {
            while (i < nums.length && nums[i] != val) i++;
            while (k >= 0 && nums[k] == val) k--;
            if (i < k) {
                nums[i] = nums[k];
                k--;
            }
        }
        return k + 1;
    }
}
