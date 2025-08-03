class Solution {
    public int countCharacters(String[] words, String chars) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<chars.length();i++){
            char c=chars.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }
        boolean arr[]=new boolean[words.length];
        Arrays.fill(arr,true);
        for(int i=0;i<words.length;i++){
            HashMap<Character,Integer> map1=new HashMap<>(map);
            String w=words[i];
            for(int j=0;j<w.length();j++){
                
                char ch=w.charAt(j);
                if(map1.get(ch)==null||map1.get(ch)==0){
                    arr[i]=false;
                    break;
                }
                map1.put(ch,map1.get(ch)-1);
            }
        }
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==true){
                count=count+words[i].length();
            }
        }
        return count;
    }
}