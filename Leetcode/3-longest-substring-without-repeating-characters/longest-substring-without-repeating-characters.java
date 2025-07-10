class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character>set=new HashSet<>();
        int max=0;
        int length=0;
        int left=0;
        int right=0;
        while(left<=right&&right<s.length()){
            char c=s.charAt(right);
            if(set.contains(c)){
                    set.remove(s.charAt(left));
                    left++;
                    continue;
                
            }
            set.add(c);
            length=right-left+1;
            max=Math.max(max,length);
            right++;
        }
        return max;
    }
}