class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n=gas.length;
        int total=0,dist=0;
        int start=0;
        int curr=0;
        
        for(int i=0;i<n;i++){
            int gain=gas[i]-cost[i];
            total+=gain;
            curr+=gain;
            if(curr<0){
                start=i+1;
                curr=0;
            }
        }
        if(total>=0){
            return start;
        }
        return -1;


    }
}