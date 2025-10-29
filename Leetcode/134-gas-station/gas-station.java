class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int total=0;
        int curr=0;
        int index=0;
        for(int i=0;i<gas.length;i++){
            total=total+gas[i]-cost[i];
            curr=curr+gas[i]-cost[i];
            if(curr<0){
                index=i+1;
                curr=0;
            }
        }
        if(total<0){
            return -1;
        }
        return index;
    }
}