class Solution {
    public int rob(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        
        int prev=0;int curr=0;
        for(int i=1;i<nums.length;i++){
            int skip=curr;
            int steal=nums[i-1]+((i-2>=0) ? prev :0);
            prev=curr;
            curr=Math.max(skip,steal);
        }
        int r1=curr;
       
        prev=0;curr=0;
        for(int i=2;i<nums.length+1;i++){
            int skip=curr;
            int steal=nums[i-1]+prev;
            prev=curr;
            curr=Math.max(skip,steal);
        }
    return Math.max(r1,curr);
    }
}