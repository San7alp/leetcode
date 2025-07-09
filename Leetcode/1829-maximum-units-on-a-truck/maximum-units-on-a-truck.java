class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int res=0;
        for(int i=0;i<boxTypes.length-1;i++){
            for(int j=0;j<boxTypes.length-i-1;j++){
                if(boxTypes[j][1]<=boxTypes[j+1][1]){
                    int t=boxTypes[j][1];
                    boxTypes[j][1]=boxTypes[j+1][1];
                    boxTypes[j+1][1]=t;
                    t=boxTypes[j][0];
                    boxTypes[j][0]=boxTypes[j+1][0];
                    boxTypes[j+1][0]=t;
                }
            }
        }
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