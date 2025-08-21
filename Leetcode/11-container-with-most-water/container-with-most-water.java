class Solution {
    public static int maxArea(int[] height) {
            if(height.length==0){
                return 0;
            }
            int l=0;int r=height.length-1;
            int largest=0;
            while(l<r){
                int flag=0;
                flag=Math.min(height[l],height[r])*(r-l);
                if(height[l]<height[r]){
                    l++;
                }
                else{
                    r--;
                }
                if(largest<flag){
                    largest=flag;
                }    
            }
            return largest;
        }
    }
