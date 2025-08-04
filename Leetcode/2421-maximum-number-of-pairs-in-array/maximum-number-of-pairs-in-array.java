class Solution {
    public int[] numberOfPairs(int[] nums) {
        if(nums.length<1){
            return new int[]{0,1};
        }
        int pairs=0;
        int left=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            if(map.get(nums[i])==2){
                map.put(nums[i],0);
                pairs++;
            }
        }
        left=nums.length-(pairs*2);
        return new int[]{pairs,left};
    }
}