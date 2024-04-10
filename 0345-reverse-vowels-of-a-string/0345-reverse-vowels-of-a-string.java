class Solution {
    public String reverseVowels(String s) {

        char[] chars = s.toCharArray();
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));

        int left = 0;
        int right =chars.length-1;

        while(left<right){

        while(left<right && !vowels.contains(chars[left]))
        {
            left++;

        }
         while(left<right && !vowels.contains(chars[right]))
        {
            right--;

        }

        char temp = chars[left];
        chars[left]=chars[right];
        chars[right]=temp;

        left++;
        right--;}



    return new String(chars);    
    }

   
}