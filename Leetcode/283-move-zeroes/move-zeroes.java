class Solution {
    public void moveZeroes(int[] nums) {
        int z=0;int t=0;
        if(nums.length==1){
            return ;
        }
        
        
        while(z<=nums.length-1&&t<nums.length){
            if(z>t){
                t++;
            }
            
            if(nums[z]==0&&nums[t]!=0){
                swap(nums,z,t);
                z++;t++;

            }
            else if(nums[z]!=0){
                z++;
            } 
            else{
                t++;
            }
            
        }
 
    }
    public void swap(int []nums,int l,int r){
        int t=nums[l];
        nums[l]=nums[r];
        nums[r]=t;
    }
}