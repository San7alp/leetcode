class Solution {
    public int countHillValley(int[] nums) {
        int distinct=0;
        int count=0;
        for(int i=1;i<nums.length-1;i++){
            if(nums[i]!=nums[i+1]){
                if(nums[distinct]<nums[i]&&nums[i+1]<nums[i]||nums[distinct]>nums[i]&&nums[i+1]>nums[i]){
                    count++;
                }
                distinct=i;
            }
        }
        return count;
    }
}