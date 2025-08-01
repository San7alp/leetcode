class Solution {
    public void sortColors(int[] nums) {
        //DNF algorithm
        int low=0;
        int mid=0;
        int high=nums.length-1;
        while(mid<=high){
            if(nums[mid]==0){
                swap(nums,mid,low);
                low++;
                mid++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else{
                swap(nums,high,mid);
                high--;
            }
        } 
    }
    public void swap(int [] nums,int x,int y){
        int t=nums[x];
        nums[x]=nums[y];
        nums[y]=t;
    }
}