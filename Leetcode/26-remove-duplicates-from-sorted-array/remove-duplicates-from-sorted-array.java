class Solution {
    public int removeDuplicates(int[] nums) {
        int []arr=new int [nums.length];
        int flag=0;
        for(int i=0;i<nums.length;i++){
            boolean x=false;
            for(int j=0;j<flag;j++){
                if(arr[j]==nums[i]){
                    x=true;
                }}
            if(x!=true){
                arr[flag]=nums[i];
                flag++;
            }}
        for(int i=0;i<flag;i++){
            nums[i]=arr[i];
        }
        return flag;
    
    }}