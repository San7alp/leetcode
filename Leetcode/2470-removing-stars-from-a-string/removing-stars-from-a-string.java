class Solution {
    public String removeStars(String s) {
        Stack<Character>stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            stack.push(c);
            if(stack.peek()=='*'){
                stack.pop();
                stack.pop();
            }
        }
        StringBuffer res=new StringBuffer();
        while(!stack.isEmpty()){
            res.append(stack.pop());
        }
        return res.reverse().toString();
    }
}