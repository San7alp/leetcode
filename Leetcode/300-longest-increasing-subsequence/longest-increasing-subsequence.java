class Solution {
    public int solve(int [] nums,int [][]dp,int i,int last){
        if(nums.length<=i){
            return 0;
        }
        if(dp[i][last+1]!=-1) return dp[i][last+1];
        int take =0;
        int skip=0+solve(nums,dp,i+1,last);
        if(last==-1||nums[i]>nums[last]){
            take=1+solve(nums,dp,i+1,i);
        }
        return dp[i][last+1]=Math.max(take,skip);

    }
    public int lengthOfLIS(int[] nums) {
        int dp[][]=new int[nums.length+1][nums.length+1];
        for(int arr[]:dp){
            Arrays.fill(arr,-1);
        }
        return solve(nums,dp,0,-1);
    }
}