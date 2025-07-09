class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int res=0;
         Arrays.sort(boxTypes, (a, b) -> Integer.compare(b[1],a[1]));
        for(int i=0;i<boxTypes.length;i++){
            int capacity=0;
            if(truckSize==0){
                return res;
            }
            if(truckSize>=boxTypes[i][0]){
                 capacity=boxTypes[i][0]*boxTypes[i][1];
                truckSize=truckSize-boxTypes[i][0];
            }
            else if(truckSize<boxTypes[i][0]){
                 capacity=truckSize*boxTypes[i][1];
                truckSize=0;
            }
            res=res+capacity;
    }
    return res;
}
}