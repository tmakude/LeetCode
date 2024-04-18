class Solution {
    public int minLength(String s) {
        Stack<Character> st = new Stack<>();

         int currentLength = s.length();
        int prevLength;

        do {
            prevLength = currentLength;
            s = s.replace("AB", "").replace("CD", "");
            currentLength = s.length();
        } while (currentLength < prevLength);

        return currentLength;
        
    }
}