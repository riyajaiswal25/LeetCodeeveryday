class Solution {
    public int countCharacters(String[] words, String chars) {
        if (chars == null || chars.length() == 0) {
            return 0;
        }
        
        Map<Character, Integer> charCount = new HashMap<>();
        for (char c : chars.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        
        int totalLen = 0;
        
        for (String word : words) {
            boolean isFound = true;
            Map<Character, Integer> map = new HashMap<>();
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                if (map.getOrDefault(c, 0) >= charCount.getOrDefault(c, 0)) {
                    isFound = false;
                    break;
                }
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
            if (isFound) {
                totalLen += word.length();
            }
        }
        return totalLen;
    }
}