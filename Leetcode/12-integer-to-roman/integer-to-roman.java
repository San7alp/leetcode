class Solution {
    public String intToRoman(int num) {
        String s="";
        int arr[]={1,4,5,9,10,40,50,90,100,400,500,900,1000};
        String[]str={"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
        int n=arr.length;
        while(num>0){
            for(int i=n-1;i>=0;i--){
                if(num/arr[i]>0){
                    int x=num/arr[i];
                    s=s+str[i].repeat(x);
                    num=num-(x*arr[i]);
                }
            }
        }return s;
    }
}