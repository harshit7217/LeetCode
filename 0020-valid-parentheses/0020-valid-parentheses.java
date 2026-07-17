class Solution {
    public boolean isValid(String s) {
        Stack<Character> stk = new Stack<>();
        if(s == null || s.length() == 0)
            return true;
        
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == ')'){
                if(!stk.isEmpty() && stk.peek() == '(')
                    stk.pop();
                else 
                    return false;
            }else if(s.charAt(i) == '}'){
                if(!stk.isEmpty() && stk.peek() == '{')
                    stk.pop();
                else 
                    return false;
            }else if(s.charAt(i) == ']'){
                if(!stk.isEmpty() && stk.peek() == '[')
                    stk.pop();
                else 
                    return false;
            }else {
                stk.push(s.charAt(i));
            }
        }

        return stk.isEmpty() ? true : false;
    }
}