class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int sum1=nums[0];
        int max=nums[0];
        int sum2=nums[0];
        int min=nums[0];
        int tsum=nums[0];
        for(int i=1;i<nums.length;i++){
            tsum=tsum+nums[i];
            sum1=Math.max(nums[i],sum1+nums[i]);
            max=Math.max(sum1,max);
            sum2=Math.min(nums[i],sum2+nums[i]);
            min=Math.min(sum2,min);
        }
        if (max < 0) return max;
        return Math.max(max,tsum-min);
    }
}