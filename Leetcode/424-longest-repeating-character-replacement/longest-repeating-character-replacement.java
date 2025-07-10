class Solution {
    public int characterReplacement(String s, int k) {
        int[]count=new int[26];
        int result=0;
        int max=0;
        int left=0;
        for(int right=0;right<s.length();right++){
            int i=s.charAt(right)-'A';
            count[i]++;
            max=Math.max(count[i],max);
            while((right-left+1)-max>k){
                count[s.charAt(left)-'A']--;
                left++;
            }
            result=Math.max(result,right-left+1);
        }
        return result;
    }
}