class Solution {
    public boolean checkInclusion(String s1, String s2) {

       if (s1.length() > s2.length()) {
            return false;
        }
        
        int[] s1Freq = new int[26];
        int[] s2Freq = new int[26];
        
        // Initialize frequency counts for s1 and the first window of s2
        for (char c : s1.toCharArray()) {
            s1Freq[c - 'a']++;
        }
        for (int i = 0; i < s1.length(); i++) {
            s2Freq[s2.charAt(i) - 'a']++;
        }
        
        // Slide the window through s2
        for (int i = 0; i <= s2.length() - s1.length(); i++) {
            // Check if the frequencies of the current window match those of s1
            if (Arrays.equals(s1Freq, s2Freq)) {
                return true;
            }
            
            // Slide the window by decrementing the frequency of the outgoing character
            if (i + s1.length() < s2.length()) {
                s2Freq[s2.charAt(i) - 'a']--;
                s2Freq[s2.charAt(i + s1.length()) - 'a']++;
            }
        }
        
        return false;
    }
}