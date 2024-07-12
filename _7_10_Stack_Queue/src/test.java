import java.util.Stack;

public class test {
    public static void main(String[] args) {
        MyStack stack =new MyStack();
        stack.push(10);
        stack.push(13);
        stack.push(12);
        stack.push(11);
        stack.display();
        isValid("()");
    }

        public static boolean isValid(String s) {
            Stack<Character> stack = new Stack<>();
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                if (stack.isEmpty()) {
                    return false;
                }
                if (ch == '(' || ch == '[' || ch == '{') {
                    stack.push(ch);
                } else {
                    if (ch == ')' && stack.peek() == '('
                            || ch == '}' && stack.peek() == '{'
                            || ch == ']' && stack.peek()== '[') {
                        stack.pop();
                    } else {
                        return false;
                    }
                }
            }
            if (!stack.isEmpty()) {
                return false;
            }
            return true;
    }


}
