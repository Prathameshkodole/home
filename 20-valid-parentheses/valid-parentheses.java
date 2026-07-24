class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        int len = s.length();
        if(s.length()<=1)return false;
        for(int i=0;i<len;i++){
            char c = s.charAt(i);
            if(c == '[' || c=='{' || c=='('){
                stack.push(s.charAt(i));
            }else if(c==']' && stack.size()>0 && stack.peek()=='['){
                stack.pop();
            }else if(c=='}' && stack.size()>0 && stack.peek()=='{'){
                stack.pop();
            }else if(c==')' && stack.size()>0 && stack.peek()=='('){
                stack.pop();
            }else{
                stack.push(s.charAt(i));
            }
        }
        if(stack.size()==0){
            return true;
        }
        return false;
    }
}