class Solution {
    public boolean halvesAreAlike(String s) {
        int countA=0;int countB=0;
        for(int i=0;i<s.length();i++){
            if(i<s.length()/2){
                if(isAVowel(s.charAt(i))){
                    countA++;
                }
            }
            else{
                if(isAVowel(s.charAt(i))){
                    countB++;
                }
            }
        }
        if(countA==countB){
            return true;
        }
        return false;
    }
    public boolean isAVowel(char c){
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
            return true;
        }

        return false;
    }
}