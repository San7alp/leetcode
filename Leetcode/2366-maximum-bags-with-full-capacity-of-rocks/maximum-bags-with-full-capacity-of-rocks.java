class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int left[]=new int[rocks.length];
        for(int i=0;i<rocks.length;i++){
            left[i]=capacity[i]-rocks[i];
        }
        Arrays.sort(left);
        int full=0;
        for(int i=0;i<left.length;i++){
            if(left[i]<=additionalRocks){
                additionalRocks=additionalRocks-left[i];
                full++;
            }
    else{
        break;
    }
        }
        return full;

    }
}