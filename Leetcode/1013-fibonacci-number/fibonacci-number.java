class Solution {
    public int fib(int n) {
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        return F(dp,n);
        
    }
    public int F(int []dp,int n){
        if(n<2){
            return n;
        }
        if(dp[n]!=-1) return dp[n];
        return dp[n]=F(dp,n-1)+F(dp,n-2);
    }
}