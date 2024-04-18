class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> result = new ArrayList<>();

        for(String word : words){

            if(Matches(word,pattern))
            {
                result.add(word);
            }

        }

        return result;
    }
    private boolean Matches(String w , String p)
    {
        Map<Character,Character> m1= new HashMap< >();
        Map<Character,Character> m2= new HashMap< >();
        for(int i=0;i<w.length();i++)
        {
            char a=w.charAt(i);
            char v=p.charAt(i);
            if(m1.containsKey(a)&&m1.get(a)!=v || m2.containsKey(v) && m2.get(v)!=a)
            return false;
            m1.put(a,v);
            m2.put(v,a);

        }

        return true;
    }
}