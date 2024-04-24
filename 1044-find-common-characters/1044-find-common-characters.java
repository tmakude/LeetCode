class Solution {
    public List<String> commonChars(String[] words) {
       
        // store character frequencies of the first word
        Map<Character, Integer> freqMap = new HashMap<>();
        for (char c : words[0].toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }
        
        // Iterate over the remaining words to store frequency
        for (int i = 1; i < words.length; i++) {
            Map<Character, Integer> tempMap = new HashMap<>();
            for (char c : words[i].toCharArray()) {
                tempMap.put(c, tempMap.getOrDefault(c, 0) + 1);
            }
            
            // Update the freqMap to contain only characters present in both maps
            for (char c : freqMap.keySet()) {
                if (tempMap.containsKey(c)) {
                    freqMap.put(c, Math.min(freqMap.get(c), tempMap.get(c)));
                } else {
                    freqMap.put(c, 0);
                }
            }
        }
        
        // Collect characters that appear in all words
        List<String> result = new ArrayList<>();
        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            char c = entry.getKey();
            int count = entry.getValue();
            for (int i = 0; i < count; i++) {
                result.add(String.valueOf(c));
            }
        }
        
        return result;
        
    }
}