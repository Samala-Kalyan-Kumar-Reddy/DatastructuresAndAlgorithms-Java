class Solution {
    public boolean isAnagram(String s, String t) {
          if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> charFrequency = new HashMap<>();

        for (char c : s.toCharArray()) {
            charFrequency.put(c, charFrequency.getOrDefault(c, 0) + 1);
        }

        for (char c : t.toCharArray()) {
            if (!charFrequency.containsKey(c) || charFrequency.get(c) <= 0) {
                return false;
            }
            charFrequency.put(c, charFrequency.get(c) - 1);
        }

        return true;
    }
}