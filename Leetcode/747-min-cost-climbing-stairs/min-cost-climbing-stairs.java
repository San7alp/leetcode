class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
         int []dp=new int[n+1];
        Arrays.fill(dp,-1);
        // return Math.min(cost[0],cost[1])+solve(cost,dp,n,2);
        int n1=solve(cost,dp,n,0);
        int n2=solve(cost,dp,n,1);
        return Math.min(n1,n2);
    }
    public int solve(int[]nums,int []dp,int n,int i){
        if(i>=n){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        return dp[i]=Math.min(nums[i]+solve(nums,dp,n,i+1),nums[i]+solve(nums,dp,n,i+2));
    }
}