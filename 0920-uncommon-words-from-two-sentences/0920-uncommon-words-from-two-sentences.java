class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {

        HashMap<String , Integer> map = new HashMap<>();

        String[] word1 = s1.split(" ");
        String[] word2 = s2.split(" ");

        for(String word : word1)
        {
            map.put(word , map.getOrDefault(word , 0)+1);
        }

        for(String words : word2)
        {
            map.put(words , map.getOrDefault(words , 0)+1);
        }

        List<String> list = new ArrayList<>();

        for(Map.Entry<String , Integer> entry : map.entrySet())
        {
            if(entry.getValue() == 1)
            {
                list.add(entry.getKey());
            }
        }

        return list.toArray(new String[0]);


        
    }
}