class Solution {
    public int rob(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        int[]t=new int[nums.length+1];
        t[0]=0;
        for(int i=1;i<nums.length;i++){
            int skip=t[i-1];
            int steal=nums[i-1]+((i-2>=0) ? t[i-2] :0);
            t[i]=Math.max(skip,steal);
        }
        int r1=t[nums.length-1];
        Arrays.fill(t,0);
        t[0]=0;
        for(int i=2;i<nums.length+1;i++){
            int skip=t[i-1];
            int steal=nums[i-1]+t[i-2];
            t[i]=Math.max(skip,steal);
        }
    return Math.max(r1,t[nums.length]);
    }
}