class Solution {
    public boolean isSameAfterReversals(int num) {

        int reverse1 = Integer.parseInt(new StringBuilder(String.valueOf(num)).reverse().toString());

        int reverse2 =Integer.parseInt(new StringBuilder(String.valueOf(reverse1)).reverse().toString());

        return reverse2 == num;


        
    }

  
}