class Solution {
    public int triangleNumber(int[] nums) {
        int count = 0;
        Arrays.sort(nums);

        for(int k=nums.length-1;k>=2;k--){
            int left=0;int right=k-1;
            while(left<right){
                int sum=nums[left]+nums[right];
                if(sum>nums[k]){
                    count+=right-left;
                    right--;
                }
                else{
                    left++;
                }
            }
        }
        return count;
    }
}
