class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        HashSet<String> set=new HashSet<>(dictionary);
        ArrayList<String>list=new ArrayList<>(Arrays.asList(sentence.split(" ")));
        StringBuilder res=new StringBuilder();
        for(String t:list){
            int i=0;
            while(i<=t.length()){
                String s=t.substring(0,i);
                i++;
                if(set.contains(s)){
                    res.append(s).append(" ");
                    break;
                }
                if(i==t.length()+1){
                    res.append(t).append(" ");
                }
            }
        }
        res.deleteCharAt(res.length()-1);
        return res.toString();
    }
}