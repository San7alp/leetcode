
public class Lc42 {

    public static void main(String[] args) {
        int arr[] = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        Lc42 candy = new Lc42();
        System.out.println(candy.trap(arr));
    }

    public int trap(int[] height) {
        int maxleft[] = new int[height.length];
        int maxright[] = new int[height.length];
        int min[] = new int[height.length];
        int max = 0;
        for (int i = 0; i < height.length; i++) {
            max = Math.max(height[i], max);
            maxleft[i] = max;
        }
        int maxr = 0;
        for (int i = height.length - 1; i >= 0; i--) {
            maxr = Math.max(height[i], maxr);
            maxright[i] = maxr;
        }
        for (int i = 0; i < height.length; i++) {
            int m = Math.min(maxleft[i], maxright[i]);
            min[i] = m;
        }
        int water = 0;
        for (int i = 0; i < height.length; i++) {
            if (min[i] - height[i] > 0) {
                water += min[i] - height[i];
            }
        }
        return water;
    }
}
