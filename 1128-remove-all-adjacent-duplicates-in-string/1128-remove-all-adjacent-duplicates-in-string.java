class Solution {
    public String removeDuplicates(String s) {
         Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (st.isEmpty() || s.charAt(i) != st.peek()) {
                st.push(s.charAt(i));
            } else {
                st.pop();
            }
        }

        if (st.isEmpty()) {
            return "";
        }

        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()) {
            sb.append(st.pop());
        }

        return sb.reverse().toString();
        
    }
}