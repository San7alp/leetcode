class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        HashSet<String>set=new HashSet<>(dictionary);
        ArrayList<String>list=new ArrayList<>(Arrays.asList(sentence.split(" ")));
        StringBuilder res=new StringBuilder();
        for(String s:list){
            boolean flag=false;
            for(int i=0;i<=s.length();i++){
                if(set.contains(s.substring(0,i))){
                    res.append(s.substring(0,i)).append(" ");
                    flag=true;
                    break;
                }
            }
            if(!flag){
                res.append(s).append(" ");
            }
        }
        return res.substring(0,res.length()-1).toString();
    }
}