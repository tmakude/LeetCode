class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {

        String newParaghraph = paragraph.replaceAll("[!?',;\\.]", " ").toLowerCase();

        String[] words = newParaghraph.split("\\s+");

        Set<String> newBanned = new HashSet<>(Arrays.asList(banned));
        Map<String , Integer> wordCount = new HashMap<>();

        for(String word : words)
        {
            if(!newBanned.contains(word))
            {
                wordCount.put(word , wordCount.getOrDefault(word , 0)+1);
            }
        }

        String mostComman = " ";
        int maxCount = 0;

        for(Map.Entry<String , Integer> entry : wordCount.entrySet()){

            if(entry.getValue() > maxCount)
            {
                maxCount = entry.getValue();
                mostComman = entry.getKey();
            }
        }

        return mostComman;
        
    }
}