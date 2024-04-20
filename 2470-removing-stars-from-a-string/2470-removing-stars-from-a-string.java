class Solution {
    public String removeStars(String s) {

       StringBuilder sb = new StringBuilder();
        int count = 0;
        for(int i = s.length()-1; i>= 0; i--){
            if(s.charAt(i) == '*'){
                count++;
                continue;
            }
            if(s.charAt(i) != '*' && count == 0){
                sb.append(s.charAt(i));
                continue;
            } 
            count--;

        }
        return sb.reverse().toString();
    }
}