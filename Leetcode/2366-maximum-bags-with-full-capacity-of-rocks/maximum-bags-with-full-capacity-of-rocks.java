class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        
        for(int i=0;i<rocks.length;i++){
            capacity[i]=capacity[i]-rocks[i];
        }
        Arrays.sort(capacity);
        int full=0;
        for(int i=0;i<capacity.length;i++){
            if(capacity[i]<=additionalRocks){
                additionalRocks=additionalRocks-capacity[i];
                full++;
            }
    else{
        break;
    }
        }
        return full;

    }
}