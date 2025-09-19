class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0;int right=0;
        int max=0;
        HashSet<Character>set=new HashSet<>();
        while(left<=right&&right<s.length()){
            char c=s.charAt(right);
            if(!set.contains(c)){
                set.add(c);
                max=Math.max(right-left+1,max);
                right++;
            }
            else{
                set.remove(s.charAt(left));
                left++;
            }
        }
        return max;
    }
}