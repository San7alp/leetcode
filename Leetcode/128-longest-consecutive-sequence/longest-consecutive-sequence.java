class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer>set=new HashSet<>();
        
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int result=0;
        for(int key:set){
            if(!set.contains(key-1)){
            int length=1;
            while(set.contains(key+length)){
                length++;
            }
            result=Math.max(result,length);
            }
            
        }
        return result;
    }
}