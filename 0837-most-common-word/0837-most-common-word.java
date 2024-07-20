class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {

        String lowerCaseParagraph = paragraph.replaceAll("[!?',;.]"," ").toLowerCase();

        String [] splitParagraph = lowerCaseParagraph.split("\\s+");

        Set<String> bannedList = new HashSet<>(Arrays.asList(banned));

        Map<String , Integer> countWords = new HashMap<>();

        for(String word : splitParagraph )
        {
            if(!bannedList.contains(word))
            {
                countWords.put(word , countWords.getOrDefault(word , 0) + 1 );
            }
        }

        String mostCommanWord = " ";
        int maxcount =0;

        for(Map.Entry<String , Integer> entry : countWords.entrySet())
        {
            if(entry.getValue() > maxcount)
            {
                maxcount = entry.getValue();
                mostCommanWord = entry.getKey();

            }
        }

        return mostCommanWord;

        
    }
}