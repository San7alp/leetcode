class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int []dp=new int[cost.length+1];
        Arrays.fill(dp,-1);
        int s1=solve(dp,cost,0);
        int s2=solve(dp,cost,1);
        return Math.min(s1,s2);
    }
    public int solve(int[]dp,int[]nums,int i){
        if(i>=nums.length) return 0;
        if(dp[i]!=-1) return dp[i];
        return dp[i]=Math.min(nums[i]+solve(dp,nums,i+1),nums[i]+solve(dp,nums,i+2));
    }
}