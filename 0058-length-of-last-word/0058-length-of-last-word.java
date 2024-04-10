class Solution {
    public int lengthOfLastWord(String s) {
        StringBuffer result=new StringBuffer();
        s=s.trim();
        for(int i=s.length()-1;i>=0;i--)
        {
            if(s.charAt(i) == ' ')
            break;
            result.append(s.charAt(i));
        }
       return result.toString().length();
        
    }
}