class Solution {
    public String[] findWords(String[] words) {

     Map<Character, Integer> rowMap = new HashMap<>();
        String[] rows = {"qwertyuiop", "asdfghjkl", "zxcvbnm"};
        
        // Create a map of characters to rows
        for (int i = 0; i < rows.length; i++) {
            for (char c : rows[i].toCharArray()) {
                rowMap.put(c, i);
            }
        }
        
        List<String> result = new ArrayList<>();
        
        // Check each word
        for (String word : words) {
            if (isSingleRow(word.toLowerCase(), rowMap)) {
                result.add(word);
            }
        }
        
        return result.toArray(new String[result.size()]);
    }
    
    private boolean isSingleRow(String word, Map<Character, Integer> rowMap) {
        if (word.length() <= 1) {
            return true; // Single-letter word is always in a single row
        }
        
        int row = rowMap.get(word.charAt(0)); // Get the row of the first letter
        
        // Check if all letters are in the same row
        for (int i = 1; i < word.length(); i++) {
            if (rowMap.get(word.charAt(i)) != row) {
                return false;
            }
        }
        
        return true;
    }
}