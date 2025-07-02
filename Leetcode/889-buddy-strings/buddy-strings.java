class Solution {
    public boolean buddyStrings(String s, String goal) {
        if(s.length()!=goal.length()){
            return false;
        }
        if(s.equals(goal)){
            HashSet<Character>set=new HashSet<>();
            for(int i=0;i<s.length();i++){
                if(set.contains(s.charAt(i))){
                    return true;
                }
                set.add(s.charAt(i));
            }return false;            
        }
        int firstpointer=-1;
        int secondpointer=-1;
         for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=goal.charAt(i)){
                if(firstpointer==-1){
                firstpointer=i;
            }
            else if(secondpointer==-1){
                secondpointer=i;
            }
            else{
                return false;
            }
            }
        }
        if(secondpointer!=-1&&s.charAt(firstpointer)==goal.charAt(secondpointer)&&goal.charAt(firstpointer)==s.charAt(secondpointer)){
            return true;
        }
        return false;
    }
}