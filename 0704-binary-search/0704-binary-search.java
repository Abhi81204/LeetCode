class Solution {
    public static int index(int[] nums, int target, int l, int r) {
        int i = (l + r) / 2;
        if (r >= l) {
            if (nums[i] == target) return i;
            if (nums[i] > target) return index(nums, target, l, i - 1);
            else return index(nums, target, i + 1, r);
        } else return -1;
    }

    public int search(int[] nums, int target) {
        return index(nums, target, 0, nums.length - 1);
    }
}
