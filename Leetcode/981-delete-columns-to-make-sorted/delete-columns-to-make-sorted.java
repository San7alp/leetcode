class Solution {
    public int minDeletionSize(String[] strs) {
        int count=0;
        for(int i=0;i<strs[0].length();i++){
            int x=0;
            for(int j=0;j<strs.length;j++){
                if(x<=(int)strs[j].charAt(i)){
                    x=(int)strs[j].charAt(i);
                }
                else{
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}