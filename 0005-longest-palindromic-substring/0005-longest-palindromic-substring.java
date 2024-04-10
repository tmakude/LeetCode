class Solution {
    int max=0 ;
    int start=0;
    int end=0;
    public String longestPalindrome(String s) {
        for(int i=0;i<s.length();i++)
        {
            for(int j=i;j<s.length();j++)
            {
                if(isPalindrom( s ,i ,j)==true)
                {
                    if((j-i+1)>max){
                    max=j-i+1;
                    start=i;
                    end=j;
                    }


                }

            }
            
        }
        return s.substring(start,end+1);
        
    }

    public boolean isPalindrom(String s , int i , int j)
    {
        while(i<j){
        char c1=s.charAt(i);
        char c2=s.charAt(j);

        if(c1!=c2)
        return false;
        i++;
        j--;
        }
        return true;
        
    }
}