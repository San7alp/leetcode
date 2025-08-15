class Solution {
    public long solve(int idx,int []nums,long[][]dp,boolean flag){
        if(idx>=nums.length){
            return 0;
        }
        int f=flag?1:0;
        if(dp[idx][f]!=-1)return dp[idx][f];
        long skip=solve(idx+1,nums,dp,flag);
        long val=nums[idx];
        if(flag==false){
            val=-val;
        }
        long steal=val+solve(idx+1,nums,dp,!flag);
        return dp[idx][f]=Math.max(skip,steal);
    }
    public long maxAlternatingSum(int[] nums){
        long[][]dp=new long[nums.length+1][2];
        for(long i[]:dp){
            Arrays.fill(i,-1);
        }
        
        
        return solve(0,nums,dp,true);
    }
}