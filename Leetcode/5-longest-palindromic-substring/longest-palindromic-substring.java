class Solution {
    public String longestPalindrome(String s) {
        String lps="";
        if(s.length()<2){
            return s;
        }
        //for odd plindromes
        for(int i=1;i<s.length();i++){
            int low=i;
            int high=i;
            while(s.charAt(low)==s.charAt(high)){
                low--;high++;
                if(low==-1||high==s.length()){
                    break;
                }
            }
            String p=s.substring(low+1,high);
            if(p.length()>lps.length()){
                lps=p;
            }
        }
        //for even palindromes
        for(int i=1;i<s.length();i++){
            int low=i-1;
            int high=i;
            while(s.charAt(low)==s.charAt(high)){
                low--;high++;
                if(low==-1||high==s.length()){
                    break;
                }
            }
            String p=s.substring(low+1,high);
            if(p.length()>lps.length()){
                lps=p;
            }
        }
        return lps;
    }
}