class Solution {
    public long flowerGame(int n, int m) {
        long x1=(n+1)/2;
        long y1=(m+1)/2;
        long x2=n/2;
        long y2=m/2;
        return x1*y2+y1*x2;
    }
}