class Solution {
    public int minOperations(String s) {
        String start1="10";
        String start0="01";
        int m=solve(s,start1);
        int n=solve(s,start0);
        return Math.min(m,n);
    }
    public int solve(String s,String str){
        int changes=0;
        int n=s.length();
        int m=str.length();
        int j=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)!=str.charAt(j)){
                changes++;
            }
            j=(j+1)%m;
        }
        return changes;
    }
}