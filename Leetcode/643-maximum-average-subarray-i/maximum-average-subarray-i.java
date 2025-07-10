class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double avg = Double.NEGATIVE_INFINITY;

        int sum=0;
        int i=0;
        for(i=0;i<k;i++){
            sum=sum+nums[i];
        }
        avg=(double)sum/k;
        for(i=k;i<nums.length;i++){
            sum=sum+nums[i]-nums[i-k];
            avg=Math.max(avg,(double)sum/k);
        }
        return (double)avg;
    }
}