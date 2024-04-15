class Solution {
    public String multiply(String num1, String num2) {

         int m = num1.length(), n = num2.length();
        int[] products = new int[m + n];
        
        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                int sum = mul + products[i + j + 1];
                
                products[i + j] += sum / 10;
                products[i + j + 1] = sum % 10;
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for (int digit : products) {
            if (!(sb.length() == 0 && digit == 0)) {
                sb.append(digit);
            }
        }
        
        return sb.length() == 0 ? "0" : sb.toString();
        
    }
}