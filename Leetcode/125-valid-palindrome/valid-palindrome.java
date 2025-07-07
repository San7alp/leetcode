class Solution {
    public boolean isPalindrome(String s) {
        int j=s.length()-1;
        int i=0;
        while(i<j){
            if(!Character.isLetterOrDigit(s.charAt(i))){
                i++;
            }
            else if(!Character.isLetterOrDigit(s.charAt(j))){
                j--;
            }
            else{
                char c = Character.toLowerCase(s.charAt(i));
                char c1 = Character.toLowerCase(s.charAt(j));
                if(c!=c1){
                    return false;
                }
                i++;j--;
            }
        }
        return true;
    }
}