class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int close=Integer.MAX_VALUE;
        int res=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            int left=i+1;int right=nums.length-1;
            while(left<right){
                int sum=nums[i]+nums[left]+nums[right];
                if(Math.abs(sum-target)<close){
                    close=Math.abs(sum-target);
                    res=sum;
                }
            if(sum<target) left++;
            else {
                right--;
            }
            }
        }
        return res;
    }
}