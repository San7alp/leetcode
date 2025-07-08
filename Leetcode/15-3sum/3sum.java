class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        ArrayList<List<Integer>>res=new ArrayList<>();
        int target=0;
        for(int i=0;i<nums.length-2;i++){
             if( i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            target=nums[i];
            int j=i+1;int k=nums.length-1;
           while(j<k){
            if(nums[j]+nums[k]==-target){
                ArrayList<Integer>list=new ArrayList<>();
                list.add(nums[i]);
                list.add(nums[j]);
                list.add(nums[k]);
                res.add(list);
                while(j<k&&nums[j]==nums[j+1])j++;
                while(j<k&&nums[k]==nums[k-1])k--;
                k--;j++;
            }
            else if(nums[j]+nums[k]<-target){
                j++;
            }
            else{
                k--;
            }
           }
        }
        return res;
    }
}