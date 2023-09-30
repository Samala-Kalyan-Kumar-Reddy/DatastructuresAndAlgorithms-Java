class Solution {
    public String longestCommonPrefix(String[] strs) {
         // Handle the case of an empty input array
        if (strs == null || strs.length == 0) {
            return "";
        }

        // Sort the array to bring the shortest string to the front
        Arrays.sort(strs);

        // Take the first and last strings (after sorting)
        String firstStr = strs[0];
        String lastStr = strs[strs.length - 1];

        // Find the common prefix between the first and last strings
        StringBuilder commonPrefix = new StringBuilder();
        int minLength = Math.min(firstStr.length(), lastStr.length());
        for (int i = 0; i < minLength; i++) {
            if (firstStr.charAt(i) == lastStr.charAt(i)) {
                commonPrefix.append(firstStr.charAt(i));
            } else {
                break;
            }
        }

        return commonPrefix.toString();
    }
}