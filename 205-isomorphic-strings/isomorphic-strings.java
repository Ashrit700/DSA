class Solution {
    public boolean isIsomorphic(String s, String t) {
        // Arrays to store the last seen positions of characters
        int[] mapS = new int[256];
        int[] mapT = new int[256];
        
        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            
            // If the last seen positions don't match, the pattern is broken
            if (mapS[c1] != mapT[c2]) {
                return false;
            }
            
            // Record the current position.
            // We use i + 1 to avoid a conflict with the default array value of 0
            mapS[c1] = i + 1;
            mapT[c2] = i + 1;
        }
        
        return true;
    }
}