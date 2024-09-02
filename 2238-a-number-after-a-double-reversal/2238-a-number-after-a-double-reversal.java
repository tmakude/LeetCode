class Solution {
    public boolean isSameAfterReversals(int num) {

        int reverse1 = reverse(num);
        int reverse2 = reverse(reverse1);

        return reverse2 == num;


        
    }

    public int reverse(int x){

        int reverse = 0;

        while(x !=0){

            int reminder = x%10;

            reverse = reverse * 10 + reminder;

            x/=10;
        }

        return reverse;


    }
}