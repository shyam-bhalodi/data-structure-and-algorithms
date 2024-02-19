package stacks;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {

    }

    public static boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        for(Character a:s.toCharArray()){
            if(a=='(')
                stack.push(')');
            else if(a=='{')
                stack.push('}');
            else if(a=='[')
                stack.push(']');
            else if(stack.isEmpty() || stack.pop()!=a){
                return false;
            }
        }
        return stack.isEmpty();
    }
}
