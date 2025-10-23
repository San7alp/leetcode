class Solution {
    public int fib(int n) {
         int []dp=new int[n+1];
        Arrays.fill(dp,-1);
        return solve(dp,n);
    }
    
    public int solve(int[]dp,int n){
        if(n<=1) return n;
        if(n<=3){
            return n-1;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        return dp[n]=solve(dp,n-1)+solve(dp,n-2);
    }
}
