class Solution {
    List<String> result=new ArrayList<>();
    int n;
    public List<String> restoreIpAddresses(String s) {
        n=s.length();
        if(n>12||n<4){
            return result;
        }
        solve("",0,0,s);
        return result;
    }
    public boolean valid(String str){
        if(str.length()==0||str.length()>3) return false;
        if(str.length()>1&&str.charAt(0)=='0') return false;
        int value=Integer.parseInt(str);
        if(value>255){
            return false;
        }
        return true;
    }
    public void solve(String curr,int index,int flag,String s){
        if(flag==4&&index==n){
            result.add(curr.substring(0,curr.length()-1));
            return;
        }

        for(int i=1;i<=3;i++){
            if(index+i<=n&&valid(s.substring(index,index+i))){
                String temp=s.substring(index,index+i)+".";
                solve(curr+temp,index+i,flag+1,s);
            }
        }

    }
}