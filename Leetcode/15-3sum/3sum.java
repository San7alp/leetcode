class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        ArrayList<List<Integer>>res=new ArrayList<>();
        for(int i=0;i<nums.length-2;i++){
            int j=i+1;
            int k=nums.length-1;
            int target=-nums[i];
            while(i<nums.length-1&&nums[i]==nums[i+1]){
                i++;//skipping the duplicates i
            }
            while(j<k){
                if(nums[j]+nums[k]==target){
                    ArrayList<Integer>list=new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[k]);
                    res.add(list);
                    while(j<k&&nums[j]==nums[j+1]){
                        j++;//skipping the duplicates j
                    }
                    while(j<k&&nums[k]==nums[k-1]){
                        k--;//skipping the duplicates k
                    }
                    j++;
                    k--;
                }
                else if(nums[j]+nums[k]<target){
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