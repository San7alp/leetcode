class Solution {
    public int[] productExceptSelf(int[] nums) {
        int zero=0;int p=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                zero++;
            }
            else{
                p=p*nums[i];
            }
        }
        for(int i=0;i<nums.length;i++){
            if(zero>1){
                nums[i]=0;
            }
            else if(zero==1){
                if(nums[i]==0){
                    nums[i]=p;
                }
                else{
                    nums[i]=0;
                }
            }
            else{
                nums[i]=p/nums[i];
            }
        }
        return nums;
    }
}