class Solution {
    public boolean isPalindrome(String s) {
        String resultString = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int leftPointer = 0;
        int rightPointer = resultString.length() - 1;

        while (leftPointer < rightPointer) {
            char leftChar = resultString.charAt(leftPointer);
            char rightChar = resultString.charAt(rightPointer);

            if (leftChar != rightChar) {
                return false; // Characters are not equal, so it's not a palindrome
            }

            leftPointer++;
            rightPointer--;
        }

        return true; // All pairs of characters were equal, so it's a palindrome
    }
}

