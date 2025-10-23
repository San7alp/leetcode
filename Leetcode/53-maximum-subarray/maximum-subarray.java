class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int []dp=new int[n+1];
        Arrays.fill(dp,-1);
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            max=Math.max(max,solve(dp,n,nums,i));
            
        }
        return max; 
    }
    public int solve(int[]dp,int n,int []nums,int i ){
        if(i>=n){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int take=nums[i]+solve(dp,n,nums,i+1);
        
        return dp[i]=Math.max(take,nums[i]);
    }
}