class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        ArrayList<List<Integer>>res=new ArrayList<>();
        Arrays.sort(nums);
        
        for(int i=0;i<nums.length-2;i++){
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int sum=0;
            int left=i+1;
            int right=nums.length-1;
            
            while(left<right){
                sum=nums[i]+nums[left]+nums[right];
                if(sum==0){
                    ArrayList<Integer>list=new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[left]);
                    list.add(nums[right]);
                    res.add(list);
                    while(left<right&&nums[left]==nums[left+1]){
                        left++;
                    }
                    while(left<right&&nums[right]==nums[right-1]){
                        right--;
                    }
                    right--;
                    left++;
                }
                else if(sum<0){
                    left++;
                }
                else{
                    right--;
                }
            }
        }
        return res;
    }
}