class Solution {
    public String reverseWords(String s) {
        String words[] = s.split(" ");

        StringBuilder result = new StringBuilder();

        for(String word : words)
        {
            String reverseword = reversestring(word);

            result.append(reverseword ).append(" ");
        }

        return result.toString().trim();
        
    }

    private String reversestring(String words)
    {
    char[] chars = words.toCharArray();
    int left = 0, right = words.length() - 1;
    while (left < right) {
        char temp = chars[left];
        chars[left] = chars[right];
        chars[right] = temp;
        left++;
        right--;
    }
    return new String(chars);
    }
}