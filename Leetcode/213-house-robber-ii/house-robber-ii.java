class Solution {
    public int rob(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        int[]dp=new int[nums.length];
        Arrays.fill(dp,-1);
        int s1=solve(dp,nums,0,nums.length-1);
        Arrays.fill(dp,-1);
        int s2=solve(dp,nums,1,nums.length);
        return Math.max(s1,s2);
    }
    public int solve(int []dp,int []nums,int i,int n){
        if(i>=n){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int take=nums[i]+solve(dp,nums,i+2,n);
        int leave=solve(dp,nums,i+1,n);
        return dp[i]=Math.max(take,leave);
        

    }
}