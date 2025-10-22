class Solution {
    public int uniquePaths(int m, int n) {
        int[][]dp=new int[m+1][n+1];
        for(int []row:dp){
            Arrays.fill(row,-1);
        }
        return solve(dp,m,n);
    }
    public int solve(int[][]dp,int m,int n){
        if(m==1||n==1) return 1;
        if(dp[m][n]!=-1){
            return dp[m][n];
        }
        return dp[m][n]=solve(dp,m-1,n)+solve(dp,m,n-1);
    }
}