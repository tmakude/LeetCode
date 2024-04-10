class Solution {
    int n;
    private Boolean[] t;
    public boolean wordBreak(String s, List<String> wordDict) {
        n=s.length();
        t=new Boolean[s.length()];
        return solve(s,0,wordDict);
    }

       public boolean solve(String s,int idx, List<String>wordDict) 
       {
           if(idx==n)
           {
               return true;
           }
           if(t[idx]!=null)
           {
               return t[idx];
           }

           for(int endIdx=idx+1;endIdx<=n;endIdx++)
           {
               String split=s.substring(idx,endIdx);

               if(wordDict.contains(split)&&solve(s,endIdx,wordDict))
               {
                   return t[idx]=true;
               }
           }

        return t[idx]=false;
    }
}