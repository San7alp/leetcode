class Solution {
    public String longestNiceSubstring(String s) {
        String res="";
        int max=0;
        Set<String> set =new HashSet<>();
        for(int i=0;i<s.length();i++){
            for(int j=0;j+i<=s.length();j++){
                String str=s.substring(i,i+j);
                if(niceString(str)){
                    if(max<str.length()){
                        max=str.length();
                        res=str;
                    }
                }
            }
        }
        
        return res;
    }
    public boolean niceString(String str){
        
        
            Set<Character> set1 =new HashSet<>();
            boolean flag=true;
            for(int i=0;i<str.length();i++){
                set1.add(str.charAt(i));
            }
            for(int i=0;i<str.length();i++){
                if(Character.isLowerCase(str.charAt(i))){
                    if(!set1.contains(Character.toUpperCase(str.charAt(i)))){
                        flag=false;
                    }
                }
                else{
                    if(!set1.contains(Character.toLowerCase(str.charAt(i)))){
                        flag=false;
                    }
                }
            }
            return flag;
        
    }
}