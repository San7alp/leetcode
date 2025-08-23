class Solution {
    public long solve(int i,int []nums,long[][]dp,boolean flag){
        if(i>=nums.length){
            return 0;
        }
        int f=flag?1:0;
        if(dp[i][f]!=-1)return dp[i][f];
        long skip=solve(i+1,nums,dp,flag);
        int val=nums[i];
        if(f==0){
            val=-val;
        }
        long take=val+solve(i+1,nums,dp,!flag);
        return dp[i][f]=Math.max(take,skip);
    }
    public long maxAlternatingSum(int[] nums) {
        long[][]dp=new long[nums.length+1][2];
        for(long[]arr:dp){
            Arrays.fill(arr,-1);
        }
        return solve(0,nums,dp,true);
    }
}