class Solution {
    public int scoreOfString(String s) {

        int sub = 0;

        for( int i = 0 ; i < s.length() - 1;i++)
        {
            int num = s.charAt(i);

            int num1 = s.charAt(i+1);

            sub += Math.abs(num - num1);
        }

        return sub;
        
    }
}