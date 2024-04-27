class Solution {
    public String reverseOnlyLetters(String s) {

        char c[] = s.toCharArray();

        int left = 0;
        int right = s.length()-1;

        while(left<right)
        {
            if(Character.isLetter(c[left]) && Character.isLetter(c[right]) )
            {
                char temp = c[left];

                c[left] = c[right];

                c[right] = temp;

                left++;

                right--;
            }
            else if (!Character.isLetter(c[left])) {
            
            left++;

            } else if (!Character.isLetter(c[right])) {

            right--;

            }
            }

            return new String( c);


        
    }
}