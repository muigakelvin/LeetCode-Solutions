class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        for (int i = 0; i < s.length(); i++) {
            StringBuilder substring = new StringBuilder();
            try {
                for (int j = i; j < s.length(); j++) {
                    if (substring.indexOf(String.valueOf(s.charAt(j))) != -1) {
                        break;
                    }
                    substring.append(s.charAt(j));
                    maxLength = Math.max(maxLength, substring.length());
                }
            } catch (Exception e) {
                
                e.printStackTrace();
            }
        }
        return maxLength;
    }
}
