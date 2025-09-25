class Solution {
    public int hammingDistance(int x, int y) {
        int xor=x^y;
        int c=0;
        while(xor!=0){
            c=c+(xor&1);
            xor=xor >> 1;
        }
        return c;
    }
}