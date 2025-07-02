class Solution {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length()!=word2.length()){
            return false;
        }
        // if(word1.equals(word2)){
        //     return false;
        // }
        HashSet<Character>set=new HashSet<>();
        for(int i=0;i<word1.length();i++){
            if(!set.contains(word1.charAt(i))){
                set.add(word1.charAt(i));
            }
        }
         for(int i=0;i<word2.length();i++){
            if(!set.contains(word2.charAt(i))){
                return false;
            }
        }
        int arr1[]=new int [26];
        int arr2[]=new int [26];
         for(int i=0;i<word2.length();i++){
            int x=word1.charAt(i)-'a';
            int y=word2.charAt(i)-'a';
            arr1[x]++;
            arr2[y]++;
         }
         for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    arr1[i]=0;
                    arr2[j]=0;
                }
            }
         }
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]!=0){
                return false;
            }
        }
        return true;

    }
}