class Solution {
    public int strStr(String haystack, String needle) {

       // return haystack.indexOf(needle);

       int lenth1 = haystack.length();
       int length2= needle.length();

       for(int i = 0 ; i <= lenth1-length2 ; i++){

        if(haystack.substring(i , length2+i).equals(needle)){
            return i;
        }
       }

       return -1;
        
    }
}