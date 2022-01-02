// Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
// An input string is valid if:
// - Open brackets must be closed by the same type of brackets.
// - Open brackets must be closed in the correct order.
public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()) {
            if(isLeft(c)) {
                stack.push(c);
            } else {
                if(stack.isEmpty()) return false;
                else {
                    char other = stack.pop();
                    if(other == '{') {
                        if(c != '}') return false;
                    } else if(other == '(') {
                        if(c != ')') return false; 
                    } else if(other == '[') {
                        if(c != ']') return false;   
                    } 
                }
            }
        }
        if(stack.isEmpty()) return true;
        else return false;
    }
    
    public boolean isLeft(char c) {
        if(c == '{' || c == '(' || c == '[') {
            return true;
        }
        return false;
    }
    
    public boolean isRight(char c) {
        if(c == '}' || c == ')' || c == ']') {
            return true;
        }
        return false;
    }
}