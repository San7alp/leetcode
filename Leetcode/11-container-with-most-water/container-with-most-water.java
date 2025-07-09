class Solution {
    public int maxArea(int[] height) {
        int maxvol=0;
        int j=height.length-1;
        int i=0;
        while(i<j){
            int x=Math.min(height[i],height[j]);
            int vol=x*(j-i);
            if(maxvol<vol){
                maxvol=vol;
            }
            if(height[i]<height[j]){
                i++;
            }
            else{ j--;
            }
        }
        return maxvol;

    }
}