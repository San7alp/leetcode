class Solution {
    public int climbStairs(int n) {
        int p1=1;
        int p2=1;
        for (int i=2;i<n+1;i++){
            int sum=p1+p2;
            p1=p2;
            p2=sum;
        }
        return p2;
    }
}