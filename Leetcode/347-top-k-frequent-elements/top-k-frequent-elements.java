class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        List<Integer>bucket[]=new List[nums.length+1];
    
       for(int i=0;i<nums.length;i++){
        map.put(nums[i],map.getOrDefault(nums[i],0)+1);
       }
       for(int key:map.keySet()){
        int freq=map.get(key);
        if(bucket[freq]==null){
            bucket[freq]=new ArrayList<>();
        }
        bucket[freq].add(key);
       }
       int arr[]=new int[k];
       int count=0;
       for(int pos=bucket.length-1;pos>=0&&count<k;pos--){
        if(bucket[pos]!=null){
            for(int ele:bucket[pos]){
                arr[count]=ele;
                count++;
            }
        }
       }return arr;
        //add number to arr check if the upcoming arr[i] has more frequncy in map than the arr
    }
}