class Solution {
    public int strStr(String haystack, String needle) {
        int it = haystack.indexOf(needle);
if(it != haystack.length()){ // in this condition an error generates , what should i do ?

        return it;
    }
    else{
        return -1;
    }
       

    }
}