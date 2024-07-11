class Solution {
    public int countWords(String[] words1, String[] words2) {

        HashMap<String , Integer> countWords1 = new HashMap<>();
        HashMap<String , Integer> countWords2 = new HashMap<>();

        for(String word : words1)
        {
            countWords1.put(word , countWords1.getOrDefault(word , 0)+1);
        }

        for(String words : words2)
        {
            countWords2.put(words , countWords2.getOrDefault(words , 0)+1);
        }

        int count = 0;

       for (Map.Entry<String, Integer> entry : countWords1.entrySet()) {
            String word = entry.getKey();
            int freq1 = entry.getValue();
            int freq2 = countWords2.getOrDefault(word, 0);
            if (freq1 == 1 && freq2 == 1) {
                count++;
            }
        }

        return count;


        
    }
}