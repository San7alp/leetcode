class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        ArrayList<Integer>list=new ArrayList<>();
        int a[]=new int[arr.length];
        int n=arr.length;
        int min=Integer.MAX_VALUE;int index=0;
        for(int i=0;i<arr.length;i++){
            a[i]=Math.abs(arr[i]-x);
            if(min!=a[i]){
                min=Math.min(a[i],min);
            if(min==a[i]){
                index=i;
            }
            }
        }
        int left=index;
        int right=index;
        k--;
        while (k > 0) {
            if (left - 1 < 0) {
                right++;
            } else if (right + 1 >= n) {
                left--;
            } else {
                if (Math.abs(arr[left - 1] - x) <= Math.abs(arr[right + 1] - x)) {
                    left--;
                } else {
                    right++;
                }
            }
            k--;
        }
        for(int i = left; i <= right; i++){
            list.add(arr[i]);
        }
        return list;
    }
}