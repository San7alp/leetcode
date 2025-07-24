class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        List<Integer>bucket[]=new ArrayList[nums.length+1];
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int key:map.keySet()){
            int num=map.get(key);
            if(bucket[num]==null){
                bucket[num]=new ArrayList<>();
            }
            bucket[num].add(key);
        }
       int arr[]=new int[k];
        int count=0;
        for( int pos=bucket.length-1;pos>=0&&count<k;pos--){
            if(bucket[pos]!=null){
                for(int ele:bucket[pos]){
                    if(count<k){
                        arr[count]=ele;
                    count++;
                    }
                }
            }

        }
        return arr;
    }
}