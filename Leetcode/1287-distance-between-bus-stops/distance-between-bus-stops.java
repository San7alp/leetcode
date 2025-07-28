class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int n=distance.length;
        int clockdist=0;
        int anticlockdist=0;
        int i=(start);
        while(i%n!=destination){
            i=i%n;
            clockdist+=distance[i];
            i++;
        }
        i=destination;
        while(i%n!=start){
            i=i%n;
            anticlockdist+=distance[i];
            i++;
        }
        return Math.min(anticlockdist,clockdist);
    }
}