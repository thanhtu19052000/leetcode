import java.util.Stack;

class Solution {
    public static boolean isValid(String s) {
        if (s.length() == 0) {
            return true;
        }
        if (s.length() % 2 != 0) {
            return false;
        }
        Stack stack1 = new Stack();
        for (int i = 0; i < s.length(); i++) {
            System.err.println(s.charAt(i));

            if (stack1.size() > 0 && stack1.lastElement().toString().equals("{") && s.charAt(i) == '}') {
                stack1.pop();
            } else if (stack1.size() > 0 && stack1.lastElement().toString().equals("(") && s.charAt(i) == ')') {
                stack1.pop();
            } else if (stack1.size() > 0 && stack1.lastElement().toString().equals("[") && s.charAt(i) == ']') {
                stack1.pop();
            } else {
                stack1.push(s.charAt(i));
            }
        }
        return stack1.isEmpty();
    }

    public static void main(String[] args) {
        System.err.println(isValid("(])"));
    }
}
