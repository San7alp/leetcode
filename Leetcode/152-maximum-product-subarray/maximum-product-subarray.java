class Solution {
    public int maxProduct(int[] nums) {
       
        int p1=1;
        int p2=1;
        int max=nums[0];
         for (int i = 0; i < nums.length; i++) {
            p1=(p1==0?1:p1)*nums[i];
            p2=(p2==0?1:p2)*nums[nums.length-1-i];
            int m=Math.max(p1,p2);
            max=Math.max(m,max);
            
        }
        return max;
    }
}