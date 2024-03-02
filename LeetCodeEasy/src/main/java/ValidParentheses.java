import java.util.Stack;

/**
 * https://leetcode.com/problems/valid-parentheses/
 */
public class ValidParentheses {
    public static boolean isValid(String s){
        Stack<Character> stack = new Stack<>();

        for(char c: s.toCharArray()){
            if((c=='{') || (c=='(') || (c == '[')){
                stack.push(c);
            }
            else {
                if (stack.isEmpty()) return false;
                char top = stack.peek();
                if ((c == ')' && top == '(') || (c == '}' && top == '{') || (c == ']' && top == '[')) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("{}[]"));
    }
}
