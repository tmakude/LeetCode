class Solution {
    public String removeDuplicates(String s, int k) {

    Stack<Character> charStack = new Stack<>();
        Stack<Integer> countStack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (!charStack.isEmpty() && charStack.peek() == c) {
                int count = countStack.pop() + 1;
                if (count == k) {
                    charStack.pop();
                } else {
                    countStack.push(count);
                }
            } else {
                charStack.push(c);
                countStack.push(1);
            }
        }

        StringBuilder result = new StringBuilder();
        while (!charStack.isEmpty()) {
            char c = charStack.pop();
            int count = countStack.pop();
            while (count-- > 0) {
                result.insert(0, c);
            }
        }

        return result.toString();
        
    }
}