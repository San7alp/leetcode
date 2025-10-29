class Solution {
    public int minFlips(String s) {
        int n=s.length();
        s=s+s;
        char[]str=s.toCharArray();
        char[]a=new char[n+n];
        char[]b=new char[n+n];
        for(int i=0;i<2*n;i++){
            a[i]=(i%2==0)?'1':'0';
            b[i]=(i%2!=0)?'1':'0';
        }
        int min=Integer.MAX_VALUE;
        int c=0;int d=0;
        for(int i=0;i<2*n;i++){
            if(a[i]!=str[i]) ++c;
            if(b[i]!=str[i]) ++d;
            if(i>=n){
                if(a[i-n]!=str[i-n]) --c;
                if(b[i-n]!=str[i-n]) --d;
            }
            if(i>=n-1){
                min=Math.min(min,Math.min(c,d));
            } 
        }
        return min;
    }
}