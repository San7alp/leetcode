class Solution {
    public boolean isValid(String s) {
        // if(s.length()%2!=0){
        //     return false;
        // }
        Stack<Character> stack = new Stack<>();
        int i = 0;
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }
            else {
                if (stack.isEmpty()) return false;
                char ch = stack.peek();
                if (ch == '(' && c == ')' || ch == '{' && c == '}' || ch == '[' && c == ']') {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}