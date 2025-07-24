class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer>map=new HashMap<>();
        int r=0;
        int l=0;
        int len=0;
        int mostFreq=0;
        while(r<s.length()){
            char c=s.charAt(r);
            map.put(c,map.getOrDefault(c,0)+1);
            mostFreq=Math.max(mostFreq,map.get(c));
            while(r-l+1-mostFreq>k){
                char c1=s.charAt(l);
                map.put(c1,map.getOrDefault(c1,0)-1);
                l++;
            }
        len=Math.max(r-l+1,len);
        r++;
        }
        return len;
    }
}