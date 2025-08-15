class Solution {
    public int solve(int i,int[]nums,int[]dp){
        if(i>=nums.length){
            return 0;
        }
        if(dp[i]!=-1)return dp[i];
        return dp[i]=Math.max(nums[i],nums[i]+solve(i+1,nums,dp));
    }
    public int maxSubArray(int[] nums) {
        int dp[]=new int[nums.length+1];
        Arrays.fill(dp,-1);
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,solve(i,nums,dp));
        }
        return max;
    }

}