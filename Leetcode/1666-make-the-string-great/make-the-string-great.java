class Solution {
    public String makeGood(String s) {
        Stack<Character> stack=new Stack<>();
        char c[]=s.toCharArray();
        for(int i=0;i<s.length();i++){
            if(!stack.isEmpty()&& Math.abs(stack.peek()-c[i])==32){
                stack.pop();
            }
            else{
                stack.push(c[i]);
            }
        }
            String str="";
        while (!stack.isEmpty()) {
            char c1=stack.pop();
            str=str+c1;
        }
        return new StringBuilder(str).reverse().toString();

    }
}