class Solution {
    public int findMin(int[] nums) {
        int left=0;
        int right=nums.length-1;
        int min=Integer.MAX_VALUE;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]>=nums[left]){
                min=Math.min(nums[left],min);
                left=mid+1;
            }
            else if(nums[mid]<nums[right]){
                min=Math.min(nums[mid],min);
                right=mid-1;
            }
            else{
                return mid;
            }
        }
        return min;
    }
}