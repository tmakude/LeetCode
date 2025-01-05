class Solution {
    public String removeStars(String s) {

        Stack<Character> st = new Stack<>();

        for(char c : s.toCharArray()){

            if(c == '*'){
                st.pop();
            }
            else{

                st.push(c);
            }
        }

        String str = "";

        for(char ch : st){

            str += ch;

        }
        return str;

       
       
        
    }
}