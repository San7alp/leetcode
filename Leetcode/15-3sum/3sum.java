class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        ArrayList<List<Integer>> res=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            int target=-nums[i];
            int j=i+1;
            int k=nums.length-1;
            while(i<nums.length-1&&nums[i+1]==nums[i]){
                i++;
            }
            
            while(j<k){
                if(nums[j]+nums[k]==target){
                    ArrayList<Integer> list=new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[k]);
                    list.add(nums[j]);
                    res.add(list);
                    while(j<k&&nums[j]==nums[j+1]) 
                    {j++;}
                    while(j<k&&nums[k]==nums[k-1]) 
                    {k--;}
                    j++;k--;
                }
                else if(nums[j]+nums[k]<target){
                    j++;
                }
                else{k--;}
            }
        }
        return res;

    }
}