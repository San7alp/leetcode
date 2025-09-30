class Solution {
    public int triangularSum(int[] nums) {
        int k=nums.length;
        if(k==1){
            return nums[0];
        }
        for(;k>0;k--){
            for(int i=0;i<k-1;i++){
                nums[i]=nums[i]+nums[i+1];
                if(nums[i]>9){
                    nums[i]=nums[i]%10;
                }
            }
        }
        return nums[0];
    }
}