class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0;
        int right=0;
        int max=0;
        HashSet<Character>set=new HashSet<>();
        while(left<=right&&right<s.length()){
            char c=s.charAt(right);
            if(set.contains(c)){
                char c1=s.charAt(left);
                while(c!=c1){
                    set.remove(c1);
                    left++;
                    c1=s.charAt(left);
                }
                left++;
            }
                set.add(c);
                max=Math.max(right-left+1,max);
                right++;

        }
        return max;
    }
}