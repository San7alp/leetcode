class Solution {
    public boolean detectCapitalUse(String word) {
        int countUC=0,countLC=0;//uppercase&lowercase
            if(Character.isUpperCase(word.charAt(0))){
                for(int i=1;i<word.length();i++){
                    if(Character.isUpperCase(word.charAt(i))){
                        countUC++;
                    }
                    else{
                        countLC++;
                    }
                }
                if(countUC==0||countLC==0){
                    return true;
                }
            }
            else{
                for(int i=1;i<word.length();i++){
                    if(Character.isUpperCase(word.charAt(i))){
                        return false;
                    }
            }
            return true;
        }
        return false;
    }
}
