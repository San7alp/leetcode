class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int maxLength=0;
        for(int key:set){
            int length=0;
            if(!set.contains(key-1)){
                length=1;
            
            while(set.contains(key+length)){
                length++;
            }
            }    
            maxLength=Math.max(length,maxLength);
        }
       return maxLength; 
    }
}