class Solution {
    public int maxProfit(int[] prices) {
        int n=Integer.MAX_VALUE;
        int tp=0;
      // for(int i=0;i<prices.length;i++){
            int p=0;
            for(int j=0;j<prices.length;j++){
                if(n>prices[j]){
                    n=prices[j];
                }
                if(p<prices[j]-n){
                    p=prices[j]-n;
                    n=prices[j];
                    tp=tp+p;p=0;
                }
                
          //  }
        }return tp;
    }
}