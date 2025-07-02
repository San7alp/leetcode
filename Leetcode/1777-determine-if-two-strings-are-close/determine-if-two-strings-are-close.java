class Solution {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length()!=word2.length()){
            return false;//if words length are diff then false
        }
        // if(word1.equals(word2)){
        //     return false;
        // }
        HashSet<Character>set=new HashSet<>();
        for(int i=0;i<word1.length();i++){
            if(!set.contains(word1.charAt(i))){
                set.add(word1.charAt(i));//adding each unique word to the set
            }
        }
         for(int i=0;i<word2.length();i++){
            if(!set.contains(word2.charAt(i))){
                return false;
            }//checking if both words have same amount of unique letters eg w1=aabbcab & w2=abcabab both have only 3 unique letters a,b,c unlike eg w1=aabbcabz & w2=abcabab w1 have a,b,c,z
        }
        int arr1[]=new int [26];
        int arr2[]=new int [26];
         for(int i=0;i<word2.length();i++){
            int x=word1.charAt(i)-'a';
            int y=word2.charAt(i)-'a';
            arr1[x]++;
            arr2[y]++;
         }// keeping a track of frequency of each unique letter
         for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    arr1[i]=0;
                    arr2[j]=0;
                }
            }
         }//crossing if letter of the words have same frequency
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]!=0){
                return false;//if every letter have 0 freq then true
            }
        }
        return true;

    }
}