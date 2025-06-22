public class Lc42 {
    public static void main(String args[]){

    }
    public int trap(int[] height) {
        int unit=0;
        for(int i=0;i<height.length;i++){
            int maxleft=Integer.MIN_VALUE;
            int indexleft=0;
            int maxright=Integer.MIN_VALUE;
            int indexright=0;
            for(int j=i;j>=0;j--){
                if(height[j]>maxleft){
                    maxleft=height[j];
                    indexleft=j;
                }
                else{
                    break;
                }
            }
            for(int j=i;j<height.length;j++){
                if(height[j]>maxright){
                    maxright=height[j];
                    indexright=j;
                }
                else{
                    break;
                }
            }
            int min=Math.min(height[indexleft],height[indexright]);

            for(int x=indexleft;x<indexright;x++){
                if(min-height[x]>0){
                    unit+=min-height[x];
                }
            }

        }
        return unit;
    }
}