package semester5_data_structure;
import java.util.Stack;

class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();

        // 1. Read the letters one by one
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // 2. Compare with the top of the stack
            // 3. Same letter: pop. Different letter: push.
            if (!stack.isEmpty() && stack.peek() == c) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }

        // 4. Build the final String
        String result = "";
        for (char letter : stack) {
            result = result + letter;
        }
        return result;
    }
}