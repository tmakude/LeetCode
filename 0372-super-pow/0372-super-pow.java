class Solution {
    public int superPow(int a, int[] b) {

        int result = 1;
        for (int digit : b) {
            result = pow(result, 10) * pow(a, digit) % 1337;
        }
        return result;
        
    }
    private int pow(int x, int n) {
        if (n == 0) return 1;
        if (n == 1) return x % 1337;
        return pow(x % 1337, n / 2) * pow(x % 1337, n - n / 2) % 1337;
    }
}