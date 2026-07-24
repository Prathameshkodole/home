class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        int len = s.length();
        if(s.length()<=1)return false;
        for(int i=0;i<len;i++){
            if(s.charAt(i)=='{' || s.charAt(i)=='}'){
                if(s.charAt(i)=='{'){
                    stack.push(s.charAt(i));
                }else if(s.charAt(i)=='}' && stack.size()>0){
                    if(stack.peek()=='{'){
                        stack.pop();
                    }else{
                        stack.push(s.charAt(i));
                    }
                }else{
                    stack.push(s.charAt(i));
                }

            }
            if(s.charAt(i)=='[' || s.charAt(i)==']'){
                if(s.charAt(i)=='['){
                    stack.push(s.charAt(i));
                }else if(s.charAt(i)==']' && stack.size()>0){
                   
                        if(stack.peek()=='['){
                            stack.pop();
                        }else{
                        stack.push(s.charAt(i));
                        }
                    
                }else{
                    stack.push(s.charAt(i));
                }
            }
            if(s.charAt(i)=='(' || s.charAt(i)==')'){
                if(s.charAt(i)=='('){
                    stack.push(s.charAt(i));
                }else if(s.charAt(i)==')' && stack.size()>0){
                    if(stack.peek()=='('){ stack.pop();
                    }else{
                        stack.push(s.charAt(i));
                    }
                   
                }else{
                    stack.push(s.charAt(i));
                }
            }
        }
        if(stack.size()==0){
            return true;
        }
        return false;
    }
}