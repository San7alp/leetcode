class Solution {
    public int solve(int[]dp,int[]nums,int i){
        if(i>=nums.length) return 0;
        if(dp[i]!=-1) return dp[i];
        int steal=nums[i]+solve(dp,nums,i+2);
        int skip=solve(dp,nums,i+1);
        return dp[i]=Math.max(steal,skip);
    }
    public int rob(int[] nums) {
        int []dp=new int[nums.length+1];
        Arrays.fill(dp,-1);
        return solve(dp,nums,0);
    }
}