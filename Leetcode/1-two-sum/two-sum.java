class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int[]arr=new int[2];
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        
        for(int i=0;i<nums.length;i++){
            int x=target-nums[i];
            if(map.containsKey(x)&&map.get(x)!=i){
                int y=map.get(x);
                if(y<=i){
                    arr[0]=y;
                    arr[1]=i;
                }
                else{
                    arr[0]=i;
                    arr[1]=y;
                }
               return arr; 
            }
            
        }return arr;
    }
}