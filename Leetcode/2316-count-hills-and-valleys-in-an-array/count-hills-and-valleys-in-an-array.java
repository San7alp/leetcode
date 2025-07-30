class Solution {
    public int countHillValley(int[] nums) {
        int count = 0;
        int distinct=0;
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                if (nums[distinct] < nums[i] && nums[i] > nums[i + 1]) {
                    count++;
                } else if (nums[distinct] > nums[i] && nums[i] < nums[i + 1]) {
                    count++;
                }
                distinct=i;
            }
        }
        return count;
    }
}