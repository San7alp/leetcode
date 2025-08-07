class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int res[]=new int[nums.length];
        
    
        Stack<Integer> stack=new Stack<>();
    
    
        for(int i=2*nums.length-1;i>=0;i--){
            int j=(i%nums.length);
            while(!stack.isEmpty()&&nums[j]>=nums[stack.peek()]){
                stack.pop();
            }
            if(i<nums.length){
                if(stack.isEmpty()){
                res[j]=-1;
            }
            else{
                res[j]=nums[stack.peek()];
            }
            }
            
            stack.push(j);
        }
        stack.clear();
    
        
        return res;

    }
}