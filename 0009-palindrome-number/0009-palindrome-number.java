class Solution {
    public boolean isPalindrome(int x) {

 // Convert the integer to a string
        String str = Integer.toString(x);

        int left = 0;
        int right = str.length() - 1;

        // Check characters from both ends
        while (left <= right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; // Not a palindrome
            }
            left++;
            right--;
        }

        return true;
}}