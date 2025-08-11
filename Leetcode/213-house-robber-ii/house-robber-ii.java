class Solution {
    public int solve(int[]dp,int []nums,int i,int n){
        
        if(i>=n) return 0;
        if(dp[i]!=-1) return dp[i];
        int steal=nums[i]+solve(dp,nums,i+2,n);
        int skip=solve(dp,nums,i+1,n);
        return dp[i]=Math.max(steal,skip);
    }
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1){
            return nums[0];
        }
        int []dp=new int[n];
        Arrays.fill(dp,-1);
        int s1=solve(dp,nums,0,n-1);
        Arrays.fill(dp,-1);
        int s2=solve(dp,nums,1,n);
        return Math.max(s1,s2);
    }
}