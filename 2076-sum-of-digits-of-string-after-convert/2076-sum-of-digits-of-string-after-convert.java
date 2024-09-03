class Solution {
    public int getLucky(String s, int k) {
 // Step 1: Convert the string into an integer string by replacing each letter with its position in the alphabet
        StringBuilder sb = new StringBuilder();
        for (char ch : s.toCharArray()) {
            sb.append(ch - 'a' + 1);
        }
        
        // Step 2: Convert the resulting string into an integer and perform the transformation k times
        String numStr = sb.toString();
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum = 0;
            for (char ch : numStr.toCharArray()) {
                sum += ch - '0';
            }
            numStr = String.valueOf(sum);
        }
        
        return sum;

        
    }
}