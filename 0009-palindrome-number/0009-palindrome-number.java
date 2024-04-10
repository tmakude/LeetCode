class Solution {
    public boolean isPalindrome(int x) {

        int y=x;
        int digit=0;
        int reverse=0;



while(y!=0 && y>0)
{
        digit=y%10;
         reverse= reverse*10+digit;
         y=y/10;
}
        if(x== reverse )
        {
            return true;

        }
        else
        {
            return false;
        }
    }
}